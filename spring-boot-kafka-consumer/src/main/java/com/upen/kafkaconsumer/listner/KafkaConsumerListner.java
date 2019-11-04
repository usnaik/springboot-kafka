package com.upen.kafkaconsumer.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.upen.kafkaconsumer.model.User;

@Service
public class KafkaConsumerListner {
	
	@KafkaListener(topics = "Kafka_Message", groupId = "group_id")
	public void consume(String message) { 
		System.out.println("Consumed Message : " + message);
	}

	@KafkaListener(topics = "Kafka_Message_json", groupId = "group_json",
			containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) { 
		System.out.println("Consumed Json Message : " + user);
	}


}
