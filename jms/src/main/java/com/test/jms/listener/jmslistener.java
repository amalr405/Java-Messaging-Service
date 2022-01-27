package com.test.jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class jmslistener {

	@JmsListener(destination = "sample")
	public void consumer(String mesg) {
		System.out.println("new message : "+mesg);
	}
}
