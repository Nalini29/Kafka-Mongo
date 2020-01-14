package com.POC.springkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.POC.springkafka.consumer.Receiver;
import com.POC.springkafka.producer.Sender;

@SpringBootApplication
public class SpringkafkaApplication implements CommandLineRunner{

	@Autowired
	Sender sender;
	
	@Autowired
	Receiver receiver;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringkafkaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		sender.send("Hello Universe");
		sender.send("Love from Earth");
		
	}

}
