@echo off
call compile.bat
java -cp "./tomcat/webapps/ROOT/WEB-INF/classes;./tomcat/lib/servlet-api.jar;./dependencies/jsoup.jar;./dependencies/json-simple.jar;./dependencies/mysql-connector.jar"^
 Scraper