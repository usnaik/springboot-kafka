package com.upen.kafkaproducer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upen.kafkaproducer.model.User;

@RestController
@RequestMapping("kafka")
public class UserResource {
	
	@Autowired
	private KafkaTemplate<String,User> kafkaTemplate;

	@Value("${producer.topic1}")
	private String TOPIC;
	
	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String message) {
		
		kafkaTemplate.send(TOPIC,new User(message, "admin", 1200000L));
		
		return "Published Successfully";
	}
}
