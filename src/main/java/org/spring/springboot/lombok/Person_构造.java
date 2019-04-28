package org.spring.springboot.lombok;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain=true)
@Getter
@Setter
@RequiredArgsConstructor(staticName="of")
public class Person_构造 {  
	  
	@NonNull
	private String firstName;
	private String lastName, job, gender;  
	private int salary, age;  
	
  
}
