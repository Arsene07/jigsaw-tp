compile:
    javac -d classes --module-path ../mods/  --source-path src $(find . -name '*.java')

make jar:
    jar cf ../mods/iki-recruitment.jar -C classes/ .