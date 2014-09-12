package com.webonise.person;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) throws IOException{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonModule.xml"); 
		Person p = (Person)context.getBean("personBean");
		System.out.println(p.getName());
		
	}
}
