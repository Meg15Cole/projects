#!/bin/sh
javac -classpath /home/student/tomcat/webapps/ROOT/WEB-INF/classes:\
/home/student/tomcat/lib/servlet-api.jar \
-d /home/student/tomcat/webapps/ROOT/WEB-INF/classes \
src/java112/project2/*.java \
src/java112/labs2/*.java
