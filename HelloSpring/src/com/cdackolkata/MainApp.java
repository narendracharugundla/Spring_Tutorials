package com.cdackolkata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 */

/**
 * @author a807228
 *
 */
public class MainApp {

	public static void main(String[] args) {

		/*
		 * HelloWorld hellWorld=new HelloWorld();
		 * 
		 * DependentObject dependentObject=new DependentObject();
		 * hellWorld.setMessage("I own created object"); hellWorld.getMessage();
		 * dependentObject.setMessage("I am dependent object on HelloWorld class");
		 * //Object injection hellWorld.setDependentObject(dependentObject);
		 * System.out.println(hellWorld.getDependentObject().getMessage());
		 */
		HelloWorld hellWorld = new HelloWorld();
		hellWorld.getMessage();

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.setMessage(
				"Spring Framework created object.spring will take object creation and object injection into other object");
		objA.getMessage();

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();

	}

}
