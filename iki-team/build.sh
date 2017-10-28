echo 'compiling module'
javac -d classes --module-path ../modules --class-path ../lib/jackson-core-2.8.10.jar --source-path src $(find . -name '*.java')

echo 'making module jar'
jar --create  --file ../modules/iki-team.jar -C classes/ .



echo 'Launching module jar'
java --module-path ../modules/ -cp ../lib/jackson-core-2.8.10.jar:../lib/jackson-annotations-2.8.10.jar -m iki.team/fr.zenika.iki.team.service.TeamManager
java --module-path ../modules/ -m iki.team/fr.zenika.iki.team.service.TeamManager

jdeps --module-path ../modules/  ../modules/iki-team.jar

jdeps --module-path ../modules/ --jdk-internals  ../mods/iki-team.jar




TODO2:

javac -d classes --module-path ../modules --class-path ../lib/jackson-core-2.8.10.jar --add-exports java.desktop/sun.font=iki.team --source-path src $(find . -name '*.java')
java --module-path ../modules/ -cp ../lib/jackson-core-2.8.10.jar:../lib/jackson-annotations-2.8.10.jar --add-exports java.desktop/sun.font=iki.team -m iki.team/fr.zenika.iki.team.service.TeamManager
