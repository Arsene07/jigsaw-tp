javac -d classes --module-path ../modules --source-path src $(find . -name '*.java')

jar --create  --file ../modules/iki-mission.jar -C classes/ .