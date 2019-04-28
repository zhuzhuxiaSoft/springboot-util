package org.spring.springboot.lambdas;


public class B匿名内部类1_线程实现 {
	
	public static void main(String[] args) {
		
		//继承Thread
		// 1.1使用匿名内部类  
		new Thread(new Runnable() {  
		    @Override  
		    public void run() {  
		        System.out.println("Hello world !");  
		    }  
		}).start();  
		  
		// 1.2使用 lambda expression  
		new Thread(() -> System.out.println("Hello world !")).start();  
		
		System.out.println("\n----------------------------------------------------------------------------");

		//实现runnable接口
		// 2.1使用匿名内部类  
		Runnable race1 = new Runnable() {  
		    @Override  
		    public void run() {  
		        System.out.println("Hello world !");  
		    }  
		};
		
		// 2.2使用 lambda expression  
		Runnable race2 = () -> System.out.println("Hello world !");  
		   
		// 直接调用 run 方法(没开新线程哦!)  
		race1.run();  
		race2.run();
		
	}
	
}
