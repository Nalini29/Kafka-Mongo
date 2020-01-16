# Kafka-Mongo

Start zkserver,zkCli from zookeeper


Edit server.properties 

Change log.dirs 

.\bin\windows\kafka-server-start.bat .\config\server.properties 

 

.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Hello-Kafka 

List topics 

bin\windows\kafka-topics.bat --list --zookeeper localhost:2181 

Producer 

bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic Hello-Kafka 

 
Consumer 

windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --from-beginning --topic Hello-Kafka 

 

Start zkserver,zkCli from zookeeper 

To Start kafka server  

bin\windows\kafka-server-start.bat config\server.properties 

 
To Stop kafka server 

bin\windows\ kafka-server-stop.sh config\server.properties 

 

MongoDb 

 

https://www.tutorialspoint.com/mongodb/mongodb_query_document.htm 

 

> use kafka 

 

> db.message.insert({"name":"King"}) 

 

> db.message.find().pretty() 
