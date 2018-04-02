package com.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServiceScan
@ImportResource({"classpath:amqp/amqp-context.xml"})
public class TestCfRabbitMqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCfRabbitMqProducerApplication.class, args);
	}
}
