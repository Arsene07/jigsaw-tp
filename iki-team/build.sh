echo 'compiling module'
javac -d classes --module-path ../modules --source-path src $(find . -name '*.java')


echo 'making module jar'
jar --create  --file ../modules/iki-team.jar -C classes/ .


echo 'Launching module jar'
java --module-path ../modules/ -m iki.team/fr.zenika.iki.team.service.TeamManager

jdeps --module-path ../modules/  ../modules/iki-team.jar

jdeps --module-path ../modules/ --jdk-internals  ../mods/iki-team.jar