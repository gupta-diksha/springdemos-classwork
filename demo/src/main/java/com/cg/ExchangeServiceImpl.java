package com.cg;

public class ExchangeServiceImpl implements ExchangeService
{
	
	private double exchangeRate;

	

	public ExchangeServiceImpl(double exchangeRate) 
	{
		super();
		System.out.println("ExchangeServiceImpl()");
		this.exchangeRate = exchangeRate;
	}



	public double getExchangeRate()
	{
		
		System.out.println("getExchangeRate()");
		return exchangeRate;
		
	}

}
