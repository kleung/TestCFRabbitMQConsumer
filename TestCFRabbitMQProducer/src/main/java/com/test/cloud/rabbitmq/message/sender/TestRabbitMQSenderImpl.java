package com.test.cloud.rabbitmq.message.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.cloud.model.TestMessage;

@Component
public class TestRabbitMQSenderImpl implements TestRabbitMQSender {
	
	@Autowired
	protected AmqpTemplate amqpTemplate;
	
	public TestRabbitMQSenderImpl() {
		super();
	}

	@Override
	public void sendMessage(TestMessage message) {
		this.amqpTemplate.convertAndSend("messages", message);
	}

}
