# A genearl introduction of "VoID-generator"
1. VoID stands for "Vocabulary of Interlinked Datasets". It is a specification for describing the metadata of RDF datasets. For example, in our LinkedMusic datalake, various RDF graphs reside within one single SPARQL endpoint. VoID helps describe metadata for the different graphs and their interrelationships, aiding in datalake management and supporting NLQ2SPARQL workflows with LLMs, particularly for generating "federated SPARQL queries" (across different databases). 
2. This is transferred from https://github.com/JervenBolleman/void-generator, which is referenced from the paper _LLM-based SPARQL Query Generation from Natural Language over Federated Knowledge Graphs_ (https://arxiv.org/abs/2410.06062).

[Junjun Cao (junjun.cao@mail.mcgill.ca) commented]

# A Detailed Statistics generator for a VoID file

This CLI tool will automatically generates [VoID description](https://www.w3.org/TR/void/) as RDF for a public endpoint given its URL.

## Build

Building uses java 17 and maven 3.6+

```sh
mvn package
```

Or you can use one of the pre build [releases](https://github.com/JervenBolleman/void-generator/releases).

## How to use

1. Always have permission from the endpoint hoster to run this program
2. Always run this locally and directly on the endpoint, without cache/proxy servers in between
3. (If) using virtuoso connecting via jdbc is much faster than connecting via http sparql protocol
4. Check the help option for exact options.

Runs on a java 17+ jdk, see the help for how to use
```sh
java -jar target/void-generator-*uber.jar --help
```


## 1. Running against a local Virtuoso endpoint

```sh
java -jar target/void-generator-*uber.jar \
    --user dba \
    --password dba \
    --virtuoso-jdbc=jdbc:virtuoso://localhost:1111/charset=UTF-8 \ # note the localhost and "isql-t" port
    -r "https://YOUR_SPARQL_ENDPOINT/sparql" \
    -s void-file-locally-stored.ttl \
    -i "https://YOUR_SPARQL_ENDPOINT/.well-known/void"
```
E.g., If you store TheSession database as a named graph "http://theSession" in your local Open Link Virtuoso (SPARQL endpoint: http://localhost:8890/sparql), and if you want to know the VOID info of only such graph, you may run such script:
```sh
java -jar target/void-generator-*uber.jar \
    --user dba \
    --password dba \
    --virtuoso-jdbc=jdbc:virtuoso://localhost:1111/charset=UTF-8 \
    -r "http://localhost:8890/sparql" \
    -s void-specific-graph.ttl \
    -i "http://localhost:8890/.well-known/void" \
    -g "http://theSession"
```
Upon execution, it will generate the VOID info in the file named "void-specific-graph.ttl". For subsequent steps, please refer to the following "3.3" about uploading back the VOID info file back to Virtuoso...


(The IRI is supposed to be the URL of the published location of the void file/service description.)

## 2. Running against a regular SPARQL endpoint

For any endpoint supporting the SPARQL protocol.

Example given here for the WikiPathways SPARQL endpoint:

```sh
java -jar target/void-generator-*-uber.jar -r https://sparql.wikipathways.org/sparql \
   -p https://sparql.wikipathways.org/sparql \
   --void-file void-wikipathway.ttl \
   --iri-of-void 'https://rdf.wikipathway.org/.well-known/void#' \
   -g http://rdf.wikipathways.org/
```

## 3. For "LinkedMusic", taking our ->
https://virtuoso.staging.simssa.ca/sparql as an example

If working with our staging virtuoso with its SPARQL endpoint https://virtuoso.staging.simssa.ca/sparql, which contains many different graphs, and you would like to extract ontology for a specific RDF graph, please refer to the following simple example:

### 3.1 Prepare a simple example RDF data and a corresponding ontology
See the folder "simpleExampleData" which contains a set of RDF instance data (A-box) and its corresponding ontology (or T-box)

I have already uploaded "instanceToTestVoid.ttl" to our staging Virtuoso with a graph name "http://testVoid"

### 3.2 Void Generator Execution
The following shell command was executed in the macOC terminal to run the VOID Generator:
```sh
java -jar target/void-generator-*uber.jar \
   -r https://virtuoso.staging.simssa.ca/sparql \
   -p https://virtuoso.staging.simssa.ca/sparql \
   --void-file void-test.ttl \
   --iri-of-void 'https://virtuoso.staging.simssa.ca/.well-known/void#' \
   -g http://testVoid
```
It then generated a void-test.ttl file in the local repository

### 3.3 Retrieve context as prompt from VOID -> Ontology Generation
The generated void-test.ttl file was then uploaded back to the staging Virtuoso instance with a graph name "http://testVoid/voidGenerated"

Then query against the graph with the SPARQL at the end of this README.md file, you can get result, such as the following represented in json format (or some other formats you specify at the SPARQL endpoint. The output format can only be specified from the SPARQL endpoint instead of the SPARQL query interface in Virtuoso Conductor):

```json
{ "head": { "link": [], "vars": ["subjectClass", "prop", "objectClass", "objectDatatype"] },
  "results": { "distinct": false, "ordered": true, "bindings": [
    { "subjectClass": { "type": "uri", "value": "http://example.org/Book" }	, "prop": { "type": "uri", "value": "http://example.org/hasAuthor" }	, "objectClass": { "type": "uri", "value": "http://example.org/Author" }},
    { "subjectClass": { "type": "uri", "value": "http://example.org/Book" }	, "prop": { "type": "uri", "value": "http://example.org/publicationYear" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://example.org/Author" }	, "prop": { "type": "uri", "value": "http://example.org/birthYear" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://example.org/Book" }	, "prop": { "type": "uri", "value": "http://example.org/title" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://example.org/Author" }	, "prop": { "type": "uri", "value": "http://example.org/name" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }} ] } }
```
Refer to promptForConvertingVOID_toOntology.md, by providing which to LLMs, the ontology in OWL format can be generated

### 3.4 A general analysis of ontology
You can use 2 tools to analysize any generated ontology (OWL):
#### 3.4.1 Protege - an ontology editing tool
https://protege.stanford.edu/
#### 3.4.2 WebVOWL - a pleasant ontology visualization tool
https://github.com/VisualDataWeb/WebVOWL or http://www.usources.cn/ont. For the latter, you can click on "G.V" button of any ontology program's visualizaiton interface; then navigate along with the bottom options: "Ontology > Custom Ontology > Upload (your owl file)", so that you can render the visualization of your own ontology file (usually in turtle format)

## What about all the options?

The command line options are there to turn off certain queries/void features that may not run in a reasonable time on specific endpoints. The default should be not to use any options.


## Structure of a void file

### General advice

When looking to generate shapes or code from a VoID file the main thing to look for are the `void:classPartition`s. For most shape and programming languages when generating code you would want one `shape` or `object oriented class` for each of them.

These `void:classPartitions`s will have `void:predicatePartition`s and `void:datatypePartition`s. The predicatePartions will lead to other resources (objects that are denoted by an IRI or BNode) while the datatypePartitions will lead to literal values.

The `void:predicatePartition`s are objects of a triple where a `void:subjectTarget` will be that triples predicate. The subject of that triple will also be a type `void:LinkSet` and the `void:objectTarget` will point to a different object of a `void:classPartition` triple.

## Logging for debugging

`-Dorg.slf4j.simpleLogger.defaultLogLevel=debug -Dorg.slf4j.simpleLogger.showDateTime=true -Dorg.slf4j.simpleLogger.log.org.apache=info`

## SPARQL queries to retrieve VoID descriptions

Once the VoID description turtle file has been generated you can upload it to your endpoint and retrieve its information with the SPARQL queries below.

Without subject/objects count:

```sparql
PREFIX up: <http://purl.uniprot.org/core/>
PREFIX void: <http://rdfs.org/ns/void#>
PREFIX void-ext: <http://ldf.fi/void-ext#>
SELECT DISTINCT ?subjectClass ?prop ?objectClass ?objectDatatype
WHERE {
  {
    ?cp void:class ?subjectClass ;
        void:propertyPartition ?pp .
    ?pp void:property ?prop .
    OPTIONAL {
        {
            ?pp  void:classPartition [ void:class ?objectClass ] .
        	
        } UNION {
            ?pp void-ext:datatypePartition [ void-ext:datatype ?objectDatatype ] .
        }
    }
  } UNION {
    ?linkset void:subjectsTarget [ void:class ?subjectClass ] ;
      void:linkPredicate ?prop ;
      void:objectsTarget [ void:class ?objectClass ] .
  }
}
```

With subject/objects count:

```sparql
PREFIX up: <http://purl.uniprot.org/core/>
PREFIX void: <http://rdfs.org/ns/void#>
PREFIX void-ext: <http://ldf.fi/void-ext#>
SELECT DISTINCT ?subjectsCount ?subjectClass ?prop ?objectClass ?objectsCount ?objectDatatype
WHERE {
  {
    ?cp void:class ?subjectClass ;
        void:entities ?subjectsCount ;
        void:propertyPartition ?pp .
    ?pp void:property ?prop .
    OPTIONAL {
        {
            ?pp  void:classPartition [ void:class ?objectClass ; void:triples ?objectsCount ] .
        	
        } UNION {
            ?pp void-ext:datatypePartition [ void-ext:datatype ?objectDatatype ] .
        }
    }
  } UNION {
    ?linkset void:subjectsTarget [ void:class ?subjectClass ; void:entities ?subjectsCount ] ;
      void:linkPredicate ?prop ;
      void:objectsTarget [ void:class ?objectClass ; void:entities ?objectsCount ] .
  }
}
```
