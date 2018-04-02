package com.test.cloud.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.cloud.model.TestMessage;
import com.test.cloud.rabbitmq.message.sender.TestRabbitMQSender;

@RestController
@RequestMapping("/api")
public class TestRestController {
	
	@Autowired
	protected TestRabbitMQSender testRabbitMqSender;
	
	public TestRestController() {
		super();
	}
	
	@RequestMapping(value="/persistRabbitMqMessage",
					method=RequestMethod.POST,
					consumes="application/json")
	public void createData(@RequestBody TestMessage message) {
		this.testRabbitMqSender.sendMessage(message);
	}

}
