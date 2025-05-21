Given the SPARQL retrieval result:
```json
{ "head": { "link": [], "vars": ["subjectClass", "prop", "objectClass", "objectDatatype"] },
  "results": { "distinct": false, "ordered": true, "bindings": [
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "https://thesession.org/tunes" }	, "objectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1569406" }	, "prop": { "type": "uri", "value": "https://thesession.org/tunes" }	, "objectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1569406" }	, "prop": { "type": "uri", "value": "https://thesession.org/settingorder" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P131" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P131" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P625" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P625" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P175" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P6375" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P6375" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P17" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P17" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "https://thesession.org/tunebooks" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P826" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P6375" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P6375" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P3440" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P276" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P276" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P658" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P1625" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2561" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2561" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1569406" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2561" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2561" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2561" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P585" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#dateTime" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1569406" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P585" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#dateTime" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P585" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#dateTime" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P1114" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P582" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#dateTime" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2894" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2894" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2894" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1569406" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2894" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P136" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1569406" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P554" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P554" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P1625" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P742" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "https://thesession.org/sessions" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2561" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2561" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P2561" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P175" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P742" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1656682" }	, "prop": { "type": "uri", "value": "http://www.wikidata.org/prop/direct/P580" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#dateTime" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q170412" }	, "prop": { "type": "uri", "value": "https://thesession.org/setting_id" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q482994" }	, "prop": { "type": "uri", "value": "http://www.w3.org/2002/07/owl#sameAs" }},
    { "subjectClass": { "type": "uri", "value": "http://www.wikidata.org/entity/Q1569406" }	, "prop": { "type": "uri", "value": "https://thesession.org/members/" }} ] } }
```

please generate an ontology, following the pattern or principles:
- Note the four variables and their values:
1. prop: represent the properties
2. subjectClass: specifies a potential `rdfs:domain` of the corresponding property
3. objectClass: specifies a potential `rdfs:range` of the corresponding property, indicating the class of individuals that can be objects of the property. If a value is provided for `objectClass`, the property is considered an object property
4. objectDatatype: specifies an `rdfs:range` for the corresponding property, indicating the datatype of literals that can be objects of the property. If a value is provided for `objectDatatype`, the property is considered a data property
5. if a property has more than one subjectClass values such as <A>, <B>... it means it has a union of classes as the property's domain (instead of an intersection of classes); so it is with the case of objectClass. E.g.,
    ```turtle
    ex:property rdfs:domain [ rdf:type owl:Class ;
                            owl:unionOf (
                                <A>
                                <B>
                            )
    ]
    ```



--execute the prompt as above, it will generate the ontology