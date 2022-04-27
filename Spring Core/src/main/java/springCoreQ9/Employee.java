package springCoreQ9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Employee {

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
	
	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Destroying Bean");
	}
	
	@PostConstruct
	public void initIt() throws Exception {
		System.out.println("Intializing Bean");
	}

}
