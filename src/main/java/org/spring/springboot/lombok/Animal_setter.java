package org.spring.springboot.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(chain=true)
@Getter
@Setter
@ToString
public class Animal_setter {  
	  
	private String name,gender;  
	private int age,sons;  
	
  
}
