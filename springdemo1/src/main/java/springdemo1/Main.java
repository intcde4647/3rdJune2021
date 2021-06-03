package springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
    // Hello hello=new Hello();
    // System.out.println(hello.message());

	// STEP1 The container is intialised 
    // with the configuration file which is containing
	// the information for the objects/beans
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	// STEP 2 From the container which is ApplicationContext we are getting an object of Hello Class 
	     Hello hello=(Hello) context.getBean("hello");
	     System.out.println(hello.message());
	}

}
