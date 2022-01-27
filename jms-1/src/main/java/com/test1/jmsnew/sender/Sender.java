package com.test1.jmsnew.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	
	@Autowired
	JmsTemplate temp;
	@Scheduled(cron = "0/10 * * * * *")
	public void sendmesg() {
		temp.convertAndSend("sample","hi how are you");
	}
}
