package springCoreQ5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunEmployee {

	public static void main(String[] args) {
		AbstractApplicationContext a = new ClassPathXmlApplicationContext("Spring5.xml");
		Employee e = (Employee)a.getBean("employee");
		System.out.println(e.toString());

	}
}
