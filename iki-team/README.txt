compile:
    javac -d classes --module-path mods --source-path src $(find . -name '*.java')
    or just jackson-databinding in module path
    javac -d classes/ -cp libs/jackson-core-2.8.10.jar:libs/jackson-annotations-2.8.10.jar --module-path ../mods/ --source-path src/ $(find . -name '*.java')
making jar:
    jar --create  --file libs/iki-team.jar -C classes/ .

viewing the content of jar:
    jar tf ../mods/iki-team.jar

run the module:
    java --module-path libs/ -m iki.team/fr.zenika.iki.team.service.TeamManager

jdeps --module-path ../mods/  ../mods