Given the SPARQL retrieval result:
```json
{ "head": { "link": [], "vars": ["subjectClass", "prop", "objectClass", "objectDatatype"] },
"results": { "distinct": false, "ordered": true, "bindings": [
    { "subjectClass": { "type": "uri", "value": "http://example.org/Book" }	, "prop": { "type": "uri", "value": "http://example.org/hasAuthor" }	, "objectClass": { "type": "uri", "value": "http://example.org/Author" }},
    { "subjectClass": { "type": "uri", "value": "http://example.org/Book" }	, "prop": { "type": "uri", "value": "http://example.org/publicationYear" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://example.org/Author" }	, "prop": { "type": "uri", "value": "http://example.org/birthYear" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#integer" }},
    { "subjectClass": { "type": "uri", "value": "http://example.org/Book" }	, "prop": { "type": "uri", "value": "http://example.org/title" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }},
    { "subjectClass": { "type": "uri", "value": "http://example.org/Author" }	, "prop": { "type": "uri", "value": "http://example.org/name" }	, "objectDatatype": { "type": "uri", "value": "http://www.w3.org/2001/XMLSchema#string" }} ] } }
```

please generate an ontology, following the pattern or principles:
- Note the four variables and their values:
1. prop: represent the properties
2. subjectClass: specifies a potential `rdfs:domain` of the corresponding property
3. objectClass: specifies a potential `rdfs:range` of the corresponding property, indicating the class of individuals that can be objects of the property. If a value is provided for `objectClass`, the property is considered an object property
4. objectDatatype: specifies an `rdfs:range` for the corresponding property, indicating the datatype of literals that can be objects of the property. If a value is provided for `objectDatatype`, the property is considered a data property


--execute the prompt as above, it will generate the ontology