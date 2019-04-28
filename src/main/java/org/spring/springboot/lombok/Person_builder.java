package org.spring.springboot.lombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person_builder {  
	  
	private String firstName;
	private String lastName, job, gender;  
	private int salary, age;  
	
  
}
