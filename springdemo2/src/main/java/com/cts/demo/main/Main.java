package com.cts.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.demo.model.Student;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student)context.getBean("stud");
        System.out.println(student.getRoll());
        System.out.println(student.getName());
        System.out.println(student.getMarks());
               
	}

}
