package com.test1.jmsnew.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	@Autowired
	JmsTemplate temp;
	@JmsListener(destination = "sample")
	public void listenmesg(String mesg) {
		System.out.println("new message arrived : "+mesg);
	}
}
