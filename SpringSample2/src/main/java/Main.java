import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonModule.xml");
		Person a = (Person)context.getBean("firstperson");
		System.out.println(a.getLastname()+" "+a.getFirstname());
		/*
		Person a2 = (Person)context.getBean("firstperson");
		System.out.println(a2.getLastname()+" "+a2.getFirstname());
		*/
	}

}
