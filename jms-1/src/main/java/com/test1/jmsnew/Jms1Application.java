package com.test1.jmsnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJms
@EnableScheduling
public class Jms1Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Jms1Application.class, args);
	}

}
