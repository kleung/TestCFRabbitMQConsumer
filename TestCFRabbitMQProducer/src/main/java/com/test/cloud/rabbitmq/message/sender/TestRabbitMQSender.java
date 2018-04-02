package com.test.cloud.rabbitmq.message.sender;

import com.test.cloud.model.TestMessage;

public interface TestRabbitMQSender {
	
	public void sendMessage(TestMessage message);

}
