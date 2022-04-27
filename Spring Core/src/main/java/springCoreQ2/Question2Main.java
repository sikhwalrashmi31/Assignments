package springCoreQ2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question2Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring2.xml");
		Question ques = context.getBean("ques",Question.class);
		System.out.println("questionId: "+ques.getQuestionId());
		System.out.println("question: "+ques.getQuestion());
		
		System.out.println("------------------------");
		System.out.println("This is for List:");
		System.out.println("Answer of person 1 is :");
		for(String q:ques.getAnswer1()){
			System.out.println(q);
		}

		System.out.println("------------------------");
		System.out.println("This is for Set: ");
		System.out.println("Answer of person 2 is :");
		for(String q1:ques.getAnswer2()){
			System.out.println(q1);
		}
	
		System.out.println("------------------------");
	 System.out.println("This is for Map: ");
	 System.out.println("Answer of person 3 is :"+ques.getAnswer3());
	}

}
