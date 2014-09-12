package com.webonise.animal;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webonise.person.Person;

public class Main {
	
	public static void main(String args[]) throws IOException{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AnimalModule.xml"); 
		AnimalImpl a = (AnimalImpl)context.getBean("animaltype");
		Animal animal = a.getAnimaltype();
		System.out.println(animal.makeSound());
		
	}
}
