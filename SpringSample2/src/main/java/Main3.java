import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonModule3.xml","PersonModule2.xml");
		Person a = (Person)context.getBean("firstperson");
		System.out.println(a.getLastname()+" "+a.getFirstname());
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("PersonModule2.xml");
		Person a2 = (Person)context2.getBean("firstperson2");
		a2.setFirstname("Murtaza3");
		a2.setLastname("Bagwala3");
		
		System.out.println(a2.getLastname()+" "+a2.getFirstname());
		
		Person a3 = (Person)context2.getBean("firstperson");
		System.out.println(a3.getLastname()+" "+a3.getFirstname());
		
		
	}

}
