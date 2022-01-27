package com.test.jms.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class jmssender {
	@Autowired
	JmsTemplate jmstemplate; 
	@Scheduled(cron = "1 * * * * *")
	public void sendmsg() {
		jmstemplate.convertAndSend("sample","hello");
		jmstemplate.convertAndSend("sample","hello2");
		jmstemplate.convertAndSend("sample","hello3");
	}
	 
}
