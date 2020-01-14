package com.POC.springkafka.consumer;
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.POC.springkafka.mongo.Message;
import com.POC.springkafka.mongo.MessageRepository;

public class Receiver {
	 @Autowired
	  private MessageRepository repository;
	
  private static final Logger LOGGER =
      LoggerFactory.getLogger(Receiver.class);

  private CountDownLatch latch = new CountDownLatch(1);

  public CountDownLatch getLatch() {
    return latch;
  }

  @KafkaListener(topics = "${kafka.topic}")
  public void receive(String payload) {
    LOGGER.info("received message from Producer ='{}'", payload);
    repository.save(new Message(payload));
    latch.countDown();
  }
}