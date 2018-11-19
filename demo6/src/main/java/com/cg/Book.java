package com.cg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book 
{
	private String isbn;
	private String year;
	private Author author;
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", year=" + year + ", author=" + author
				+ "]";
	}
	
	public String getIsbn() 
	{
		return isbn;
	}
	public void setIsbn(String isbn) 
	{
		this.isbn = isbn;
	}
	
	public String getYear()
	{
		return year;
	}
	public void setYear(String year)
	{
		this.year = year;
	}
	public Author getAuthor()
	{
		return author;
	}
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
	@PostConstruct
	void init(){
		System.out.println("in init() - called thru @PostConstruct");
	}
	
	@PreDestroy
	void destroy(){
		System.out.println("in destroy()- call thru @PreDestroy");
	}
	
	void setup()
	{
		System.out.println("In setup method");
	}
	
	void tearDown()
	{
		System.out.println("In teardown method");
	}
	
	

}
