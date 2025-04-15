java -jar target/void-generator-*uber.jar \
    --user dba \
    --password mysecret \
    --virtuoso-jdbc=jdbc:virtuoso://localhost:1111/charset=UTF-8 \
    -r "http://localhost:8890/sparql" \
    -s void-file-locally-stored.ttl \
    -i "http://localhost:8890/sparql/.well-known/void" \
    -g "http://ChineseTraditionalMusicInstrument/2024Dec3"