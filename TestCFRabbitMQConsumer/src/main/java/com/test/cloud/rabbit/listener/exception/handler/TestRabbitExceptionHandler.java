package com.test.cloud.rabbit.listener.exception.handler;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.RabbitListenerErrorHandler;
import org.springframework.amqp.rabbit.listener.exception.ListenerExecutionFailedException;
import org.springframework.stereotype.Component;

@Component(value="testRabbitExceptionHandler")
public class TestRabbitExceptionHandler implements RabbitListenerErrorHandler {

	@Override
	public Object handleError(Message amqpMessage, 
								org.springframework.messaging.Message<?> message,
								ListenerExecutionFailedException exception) throws Exception {
		System.out.println(amqpMessage);
		
		System.out.println(message);
		
		System.out.println(exception);
		exception.printStackTrace();
		
		return null;
	}

}
