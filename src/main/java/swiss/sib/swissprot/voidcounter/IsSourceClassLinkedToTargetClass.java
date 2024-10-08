package swiss.sib.swissprot.voidcounter;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import swiss.sib.swissprot.servicedescription.ClassPartition;
import swiss.sib.swissprot.servicedescription.GraphDescription;
import swiss.sib.swissprot.servicedescription.PredicatePartition;
import swiss.sib.swissprot.servicedescription.sparql.Helper;

public final class IsSourceClassLinkedToTargetClass extends QueryCallable<Long> {

	private static final String SUBJECTS = "subjects";

	public static final Logger log = LoggerFactory.getLogger(IsSourceClassLinkedToTargetClass.class);

	private final IRI predicate;
	private final ClassPartition target;
	private final PredicatePartition predicatePartition;
	private final ClassPartition source;
	private final GraphDescription gd;
	private final Lock writeLock;
	private final AtomicInteger finishedQueries;

	public IsSourceClassLinkedToTargetClass(Repository repository, IRI predicate, ClassPartition target,
			PredicatePartition predicatePartition, ClassPartition source, GraphDescription gd, Lock writeLock,
			Semaphore limiter, AtomicInteger scheduledQueries, AtomicInteger finishedQueries) {
		super(repository, limiter);
		this.predicate = predicate;
		this.target = target;
		this.predicatePartition = predicatePartition;
		this.source = source;
		this.gd = gd;
		this.writeLock = writeLock;
		this.finishedQueries = finishedQueries;
		scheduledQueries.incrementAndGet();
	}

	@Override
	protected void logStart() {
		log.debug("Checking if " + source.getClazz() + " connected to " + target.getClass() + " via " + predicate
				+ " in " + gd.getGraphName());
	}

	@Override
	protected void logEnd() {
		log.debug("Checked if" + source.getClazz() + " connected to " + target.getClass() + " via " + predicate + " in "
				+ gd.getGraphName());
	}

	@Override
	protected Long run(RepositoryConnection connection) throws Exception {
		try {
			final IRI sourceType = source.getClazz();
			final IRI targetType = target.getClazz();
			query = "SELECT (COUNT (?subject) AS ?subjects) WHERE { GRAPH <" + gd.getGraphName() + ">{ ?subject a <" + sourceType + "> ; <"
					+ predicate + "> ?target . ?target a <" + targetType + "> }}";
			return Helper.getSingleLongFromSparql(query, connection, SUBJECTS);
		} finally {
			finishedQueries.incrementAndGet();
		}
	}

	@Override
	protected void set(Long has) {
		if (has > 0) {
			try {
				writeLock.lock();
				final IRI targetType = target.getClazz();
				ClassPartition subTarget = new ClassPartition(targetType);
				subTarget.setTripleCount(has);
				predicatePartition.putClassPartition(subTarget);
			} finally {
				writeLock.unlock();
			}
		}

	}
}