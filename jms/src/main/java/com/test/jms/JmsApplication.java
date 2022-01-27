package com.test.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms

public class JmsApplication {
	@Autowired
	JmsTemplate jmstemplate;
	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}
	
	 public void run(ApplicationArguments args) throws Exception {
		 jmstemplate.convertAndSend("sample", "hello from amal");
	 }
}
