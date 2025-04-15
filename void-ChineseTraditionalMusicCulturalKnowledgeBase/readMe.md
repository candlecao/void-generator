 java -jar target/void-generator-*-uber.jar -r http://www.usources.cn:8891/sparql \
>    -p http://www.usources.cn:8891/sparql \
>    --void-file void-TaoChen.ttl \
>    --iri-of-void 'https://rdf.wikipathway.org/.well-known/void#' \
>    -g https://lib.ccmusic.edu.cn/graph/music

# note: SPARQL endpoint is http://www.usources.cn:8891/sparql and graph URI is https://lib.ccmusic.edu.cn/graph/music

# When I executed the code above, it run a very long time. The log is:

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 0/9
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 3/9
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 8/10
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 9/277
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 190/371
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 370/12647
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 562/14547
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 839/15497
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 1115/16162
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 1302/17302
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 1572/20912
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 1781/22812
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 2045/24617
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 2319/26042
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 2544/27657
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 2757/29082
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 2979/30222
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 3247/35732
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 3513/42762
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 3782/48937
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 3977/50742
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 4147/53592
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 4280/55207
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 4438/55967
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 4644/56727
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 4908/59482
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 5138/61477
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 5361/67272
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 5586/69172
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 5739/70692
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 5993/72212
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 6129/72497
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 6317/72782
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 6503/74492
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 6777/74777
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 7041/77342
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 7243/78387
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 7418/81427
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 7652/84847
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 7799/86082
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 8064/92922
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 8329/99857
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 8516/101662
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 8789/102802
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 9059/105937
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 9330/108692
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 9539/113632
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 9733/115722
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 9969/119237
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 10234/124937
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 10502/128927
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 10686/132252
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 10904/133297
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 11150/134627
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 11384/137382
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 11608/138712
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 11881/140897
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 12135/142037
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 12214/142702
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 12454/143177
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 12699/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Running: class swiss.sib.swissprot.voidcounter.IsSourceClassLinkedToTargetClass -> SELECT
        (COUNT (?subject) AS ?subjects)
WHERE {
        GRAPH  <https://lib.ccmusic.edu.cn/graph/music> {
                ?subject a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#XiansuoMusic> ;
                        <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#musicTypeAlternateName> ?target .
                ?target a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#TaoistMusic> .
        }
}

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Running: class swiss.sib.swissprot.voidcounter.IsSourceClassLinkedToTargetClass -> SELECT
        (COUNT (?subject) AS ?subjects)
WHERE {
        GRAPH  <https://lib.ccmusic.edu.cn/graph/music> {
                ?subject a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#XiansuoMusic> ;
                        <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#musicTypeAlternateName> ?target .
                ?target a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#Video-AcademicConference> .
        }
}

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 12909/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 13022/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 13298/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 13574/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 13761/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 13923/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 14142/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 14205/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 14373/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 14559/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 14830/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 15094/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 15310/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 15558/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 15749/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 15907/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 16043/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 16242/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 16518/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 16790/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 17066/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 17327/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 17574/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 17759/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 18026/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 18215/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 18451/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 18613/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 18723/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 18938/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 19130/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 19329/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 19594/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 19867/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 20042/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 20198/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 20349/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 20509/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 20745/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 20984/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 21199/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 21373/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 21489/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 21722/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 21946/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 22111/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 22324/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 22572/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 22788/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 22979/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 23253/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 23445/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 23635/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 23912/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 24172/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 24363/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 24569/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 24761/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 24952/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 25225/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Running: class swiss.sib.swissprot.voidcounter.IsSourceClassLinkedToTargetClass -> SELECT
        (COUNT (?subject) AS ?subjects)
WHERE {
        GRAPH  <https://lib.ccmusic.edu.cn/graph/music> {
                ?subject a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#Video-MusicFest_Concert_Contest_Etc> ;
                        <http://id.loc.gov/ontologies/bibframe/mount> ?target .
                ?target a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#IslamicMusic> .
        }
}

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Running: class swiss.sib.swissprot.voidcounter.IsSourceClassLinkedToTargetClass -> SELECT
        (COUNT (?subject) AS ?subjects)
WHERE {
        GRAPH  <https://lib.ccmusic.edu.cn/graph/music> {
                ?subject a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#Video-MusicFest_Concert_Contest_Etc> ;
                        <http://id.loc.gov/ontologies/bibframe/mount> ?target .
                ?target a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#Scene> .
        }
}

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 25485/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 25644/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 25878/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 26149/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 26328/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 26514/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 26717/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 26933/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 27180/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 27454/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 27648/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 27800/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 28031/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 28272/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 28496/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 28770/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 28962/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 29154/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 29376/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 29581/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 29814/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 30079/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 30199/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 30339/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 30439/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 30612/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 30802/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 31048/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 31263/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 31521/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 31648/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 31830/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 32105/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 32381/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 32574/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 32792/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 32948/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 33222/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 33498/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 33690/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 33881/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 34127/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 34345/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 34540/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 34734/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 34924/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 35165/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 35391/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 35658/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 35846/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 36119/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 36396/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 36669/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 36861/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 37130/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 37402/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 37672/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 37788/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 38065/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 38339/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Running: class swiss.sib.swissprot.voidcounter.IsSourceClassLinkedToTargetClass -> SELECT
        (COUNT (?subject) AS ?subjects)
WHERE {
        GRAPH  <https://lib.ccmusic.edu.cn/graph/music> {
                ?subject a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#TraditionalMusicBranch> ;
                        <http://www.w3.org/2000/01/rdf-schema#label> ?target .
                ?target a <http://www.kanzaki.com/ns/music#Singer> .
        }
}

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Running: class swiss.sib.swissprot.voidcounter.IsSourceClassLinkedToTargetClass -> SELECT
        (COUNT (?subject) AS ?subjects)
WHERE {
        GRAPH  <https://lib.ccmusic.edu.cn/graph/music> {
                ?subject a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#TraditionalMusicBranch> ;
                        <http://www.w3.org/2000/01/rdf-schema#label> ?target .
                ?target a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#SingingAndDancingMusic> .
        }
}

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 38534/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 38806/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 39002/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 39145/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 39391/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 39663/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 39941/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 40137/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 40410/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 40644/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 40813/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 41076/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 41175/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 41383/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 41571/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 41768/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 41963/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 42238/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 42514/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 42784/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 42978/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 43250/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 43507/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 43697/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 43912/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 44086/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 44277/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 44533/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 44664/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 44860/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 45113/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 45327/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 45522/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 45782/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 45906/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 46181/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 46456/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 46650/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 46923/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 47200/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 47453/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 47616/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 47786/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 47986/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 48156/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 48291/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 48498/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 48639/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 48811/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 48994/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 49267/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 49543/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 49736/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 50009/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 50286/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 50483/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 50677/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 50858/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 51130/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 51406/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Running: class swiss.sib.swissprot.voidcounter.IsSourceClassLinkedToTargetClass -> SELECT
        (COUNT (?subject) AS ?subjects)
WHERE {
        GRAPH  <https://lib.ccmusic.edu.cn/graph/music> {
                ?subject a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#BlowPipeInstrument> ;
                        <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#instrumentAlternateName> ?target .
                ?target a <http://id.loc.gov/ontologies/bibframe/Text> .
        }
}

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Running: class swiss.sib.swissprot.voidcounter.IsSourceClassLinkedToTargetClass -> SELECT
        (COUNT (?subject) AS ?subjects)
WHERE {
        GRAPH  <https://lib.ccmusic.edu.cn/graph/music> {
                ?subject a <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#BlowPipeInstrument> ;
                        <https://lib.ccmusic.edu.cn/ontologies/chinese_traditional_music#instrumentAlternateName> ?target .
                ?target a <http://purl.org/ontology/places#City> .
        }
}

[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 51674/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 51944/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 52112/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 52330/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 52602/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 52873/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 53144/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 53341/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 53521/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 53709/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 53897/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 54064/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 54275/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 54519/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 54609/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 54762/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 55029/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 55262/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 55488/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 55758/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 55949/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 56193/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 56407/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 56663/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 56849/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 57038/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 57219/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 57416/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 57642/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 57902/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 58122/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 58361/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 58632/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 58820/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 59063/145552
[main] INFO swiss.sib.swissprot.servicedescription.Generate - Queries 59272/145552
