package com.cg;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CurrencyConvertorClient 
{

	public static void main(String[] args)
	{
		ApplicationContext factory= new ClassPathXmlApplicationContext("currencyconvertor.xml");
		CurrencyConvertor curr = (CurrencyConvertor) factory.getBean("currencyConvertor");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+"Rs.");

	}

}
