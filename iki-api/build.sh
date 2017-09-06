echo 'compiling module'
javac -d classes --module-path ../mods --source-path src $(find . -name '*.java')


echo 'making module jar'
jar --create  --file ../mods/iki-api.jar -C classes/ .


echo 'Launching module jar'
java --module-path ../mods/ -m iki.api/fr.zenika.iki.api.controller.IkiAPI