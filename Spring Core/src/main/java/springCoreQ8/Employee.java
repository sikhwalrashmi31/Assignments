package springCoreQ8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: "+getName());
	}
	
	public void destroy() {
		System.out.println("Destroying Bean");
	}
	
	public void afterPropertiesSet() {
		System.out.println("Intializing Bean");
	}

}
