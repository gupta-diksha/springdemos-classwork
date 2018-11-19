package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientUser {

	public static void main(String[] args) {
		
		ApplicationContext factory= new ClassPathXmlApplicationContext("user.xml");
		User user= (User)factory.getBean("user");
		System.out.println("Username:"+user.getUsername());
		System.out.println("Passowrd:"+user.getPassword());
	}

}
