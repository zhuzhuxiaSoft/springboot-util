package org.spring.springboot.lombok;

import java.io.FileInputStream;
import java.io.InputStream;

import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class A_Lombok测试类 {

	public static void main(String[] args) throws Exception {
		
		Animal_setter animal = new Animal_setter();
		animal.setName("cat").setAge(1).setGender("famale");
		
		System.out.println(animal);
		
		Person_构造 person = Person_构造.of("zzx").setFirstName("zzx").setLastName(" dad").setGender("男").setSalary(1000000).setAge(29);
		System.out.println(person);
		
		Person_builder builder = Person_builder.builder().firstName("sm").age(18).build();
		System.out.println(builder);
		
		@Cleanup //自动化关闭流，相当于 jdk1.7 种的 try with resource
		InputStream is = new FileInputStream("c:\\kms10.log");
		byte[] bytes = new byte[10];
		is.read(bytes);
		log.info("日志是：{}",new String(bytes,"gbk"));
		
		
	}

}
