package com.test.cloud.rabbit.listener;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.cloud.model.MessageTest;
import com.test.cloud.repository.TestMessageRepository;

@Component
public class TestRabbitListener {
	
	@Autowired
	protected TestMessageRepository testMessageRepository;
	
	public TestRabbitListener() {
		super();
	}
	
	@RabbitListener(queues = "messageQueue",
					errorHandler="testRabbitExceptionHandler")
    public void processMessage(MessageTest data) {
		this.testMessageRepository.save(data);
	}

}
