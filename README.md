## Comandos
1- mvn clean package
2- scp -i ~/<local chave .pem> target/pizzaweb-0.0.1-SNAPSHOT.jar <nome instância na aws>:~
3- ssh -i ~/<local chave .pem> <nome instância na aws>
4- java -jar  pizzaweb-0.0.1-SNAPSHOT.jar
5- <nome instância na aws>:8080/pizzaweb/1
