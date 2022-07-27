package com.cdackolkata.core.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		 ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartment().getName());
	}
}
