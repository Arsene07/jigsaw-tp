echo 'compiling module'
javac -d classes --module-path ../modules --source-path src $(find . -name '*.java')


echo 'making module jar'
jar --create  --file ../modules/iki-api.jar -C classes/ .


echo 'Launching module jar'
java --modu