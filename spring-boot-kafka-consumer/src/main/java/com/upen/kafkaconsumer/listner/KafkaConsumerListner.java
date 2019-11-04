package com.upen.kafkaconsumer.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListner {
	
	@KafkaListener(topics = "Kafka_Message", groupId = "group_id")
	public void consume(String message) { 
		System.out.println("Consumed Message : " + message);
	}
}
