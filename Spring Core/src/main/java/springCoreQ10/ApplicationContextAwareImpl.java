package springCoreQ10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware{
	private ApplicationContext applicationContext;
	 
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       
        this.applicationContext = applicationContext;
       
    }
   
    public void displayPersonDetails(){
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person.getName());
       
        System.out.println(applicationContext.isSingleton("person"));
    }

}
