set JAVA_HOME=c:\jdk-11.0.2
cd /d F:\_REPOS\CapturaPantalla
echo %DATE% %TIME%  >> salida.txt
mvnw spring-boot:run >>salida.txt 2>>salida_error.txt