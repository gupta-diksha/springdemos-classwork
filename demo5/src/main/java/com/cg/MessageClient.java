package com.cg;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageClient {

	public static void main(String[] args) {
		
		ApplicationContext factory= new ClassPathXmlApplicationContext("message.xml");
		MessageSource msgSource = (MessageSource)factory.getBean("messageSource");
		Locale locale = new Locale("in","HN");
		String msg= msgSource.getMessage("welcome.message",null,locale);
		System.out.println(msg);
		
	}

}
