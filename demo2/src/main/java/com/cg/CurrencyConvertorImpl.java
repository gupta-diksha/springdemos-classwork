package com.cg;

public class CurrencyConvertorImpl implements CurrencyConvertor 
{
	
	private ExchangeService exchangeService;

	public CurrencyConvertorImpl() 
	{
		super();
		System.out.println("CurrencyConvertorImpl()");
	}

	public ExchangeService getExchangeService() 
	{
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) 
	{
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars)
	{
		System.out.println("dollarstoRupees()");
		return (dollars * exchangeService.getExchangeRate());
		
		
	}

}
