echo 'compiling module'
javac -d classes --module-path ../modules --source-path src $(find . -name '*.java')


echo 'making module jar'
jar --create  --file ../modules/iki-recruitment.jar -C classes/ .


echo 'Launching module jar'
java --module-path ../modules/ -m iki.recruitment/fr.zenika.iki.recruitment.service.RecruitementManager
