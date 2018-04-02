package com.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

//use this for additional manual connection pool config, include an xml, can also do java config with component scan @Configuration or @Import
@ImportResource(value= {"classpath:cloud-datasource-context.xml"})

//use this for auto service scan
@ServiceScan
public class TestCloudFoundryMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudFoundryMySqlApplication.class, args);
	}
}
