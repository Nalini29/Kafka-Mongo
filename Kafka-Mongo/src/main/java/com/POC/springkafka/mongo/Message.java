package com.POC.springkafka.mongo;

public class Message {

	public Message(String description) {
		super();
		this.description = description;
	}

	@Override
	public String toString() {
		return "Message [description=" + description + "]";
	}

	String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
