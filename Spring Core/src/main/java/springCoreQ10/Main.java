package springCoreQ10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	       
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring10.xml");
 
        ApplicationContextAwareImpl applicationContextAwareImpl = (ApplicationContextAwareImpl) applicationContext.getBean("applicationContextAware");
       
        System.out.println("Application context aware output");
        applicationContextAwareImpl.displayPersonDetails();
	}

}
