package com.cdackolkata;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */

/**
 * @author a807228
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	
		public static void main(String[] args) {
			   ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
			   
			   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
			   helloWorld.setMessage("Hello World!");
			   System.out.println(helloWorld.getMessage());
			}

	}


