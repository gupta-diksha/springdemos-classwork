package com.cg;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyListClient {

	public static void main(String[] args) {
		ApplicationContext factory= new ClassPathXmlApplicationContext("currencylist.xml");
		CurrencyList curr = (CurrencyList) factory.getBean("currencylist");
		ArrayList<String> arrList = curr.getCurrList();
		System.out.println(arrList);
	}

}
