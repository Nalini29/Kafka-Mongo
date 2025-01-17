package com.POC.springkafka.producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class Sender {

	@Value("${kafka.topic}")
	private String topic;

	private static final Logger LOGGER =
			LoggerFactory.getLogger(Sender.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void send(String payload) {
		LOGGER.info("sending payload='{}'", payload);
		kafkaTemplate.send(topic, payload);
	}
}