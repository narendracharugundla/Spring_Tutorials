package com.cdackolkata;
/**
 * 
 */

/**
 * @author a807228
 *
 */

import org.springframework.context.annotation.*;

/*<beans>
<bean id = "helloWorld" class = "com.cdackolkata.HelloWorld" />
</beans>*/

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
   
   @Bean 
   public HelloWorld helloWorld1(){
      return new HelloWorld();
   }
}