call compile.bat
copy "dependencies\*.jar" "tomcat\lib"
cd "./tomcat/bin"
call startup.bat