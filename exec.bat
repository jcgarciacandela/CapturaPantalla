set JAVA_HOME=c:\jdk-11.0.2
cd /d F:\_REPOS\sshot
echo %DATE% %TIME%  >> salida.txt
mvnw spring-boot:run >>salida.txt