package springCoreQ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Customer cus = context.getBean("cus",Customer.class); 
		System.out.println("The customer id is: "+cus.getCustomerId());
		System.out.println("The customer name is: "+cus.getCustomerName());
		System.out.println("The customer Contact number is: "+cus.getCustomerContact());
		System.out.println("The customer address is: "+cus.getCustomerAddress());
		
		Address add= context.getBean("add",Address.class);
		System.out.println("The street name is: "+add.getStreet());
		System.out.println("The city is: "+add.getCity());
		System.out.println("The State is: "+ add.getState());
		System.out.println("The Zip code is: "+add.getZip());
		System.out.println("The Country is: "+add.getCountry());
	}

}
