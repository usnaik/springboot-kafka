package com.upen.kafkaproducer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;

	@Value("${producer.topic1}")
	private String TOPIC;
	
	@GetMapping("/publish/{message}")
	public String post(@PathVariable("message") final String message) {
		
		kafkaTemplate.send(TOPIC,message);
		
		return "Published Successfully";
	}
}
