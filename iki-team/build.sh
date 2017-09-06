echo 'compiling module'
javac -d classes --module-path ../mods --source-path src $(find . -name '*.java')


echo 'making module jar'
jar --create  --file ../mods/iki-team.jar -C classes/ .


echo 'Launching module jar'
java --module-path ../mods/ -m iki.team/fr.zenika.iki.team.service.TeamManager

jdeps --module-path ../mods/  ../mods/iki-team.jar

jdeps --module-path ../mods/ --jdk-internals  ../mods/iki-team.jar