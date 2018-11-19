package com.cg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig 
{
	
	@Bean//to configure bean class
	public Author author()
	{
		return new Author("Diksha", "India");
	}
	
	@Bean(initMethod="setup",destroyMethod="tearDown")
	
	public Book book()
	{
		Book book = new Book();
		book.setIsbn("ABC123");
		book.setYear("2018");
		book.setAuthor(author());
		
		return book;
	}

}
