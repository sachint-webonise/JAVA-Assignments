package com.webonise.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonModule.xml"); 
		Employee e = (Employee)context.getBean("employeeBean");
		System.out.println(e.getFirstname()+" "+e.getLastname());
		
		VoterCard vc = (VoterCard)context.getBean("votercard");
		System.out.println(vc.getSerialid()+" "+vc.getEmployee());
		
		
		

	}

}
