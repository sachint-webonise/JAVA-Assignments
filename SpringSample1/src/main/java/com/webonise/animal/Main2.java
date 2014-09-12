package com.webonise.animal;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	
	public static void main(String args[]) throws IOException{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AnimalModule.xml"); 
		AnimalImpl2 a = (AnimalImpl2)context.getBean("animaltype2");
		Animal animal = a.getAnimaltype();
		System.out.println(animal.makeSound());
		
	}
}
