package com.cdackolkata;
/**
 * 
 */

/**
 * @author a807228
 *
 */
public class HelloWorld {

	
	private String message;
	 DependentObject dependentObject;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	public DependentObject getDependentObject() {
		return dependentObject;
	}
	public void setDependentObject(DependentObject dependentObject) {
		this.dependentObject = dependentObject;
	}
	   
	   

}
