package springCoreQ8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring8.xml");
		context.registerShutdownHook();
		Employee employee = (Employee)context.getBean("emp");
		employee.display();
	}
}
