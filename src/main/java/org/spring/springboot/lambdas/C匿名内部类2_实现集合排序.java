package org.spring.springboot.lambdas;

import java.util.Arrays;
import java.util.Comparator;



public class C匿名内部类2_实现集合排序 {
	
	public static void main(String[] args) {
		
		String[] players = {"2Rafael Nadal", "1Novak Djokovic",   
			    "5Stanislas Wawrinka", "7David Ferrer",  
			    "6Roger Federer", "4Andy Murray",  
			    "3Tomas Berdych", "9Juan Martin Del Potro"}; 
		
		String[] players2 = new String[players.length];
		String[] players3 = new String[players.length];

		System.arraycopy(players, 0, players2, 0, players.length);
		System.arraycopy(players, 0, players3, 0, players.length);

			   
			// 1.1 使用匿名内部类根据 name 排序 players  
			Arrays.sort(players, new Comparator<String>() {  
			    @Override  
			    public int compare(String s1, String s2) {  
			        return (s1.compareTo(s2));  
			    }  
			});
			
			Arrays.asList(players).forEach(System.out::println);
			
			System.out.println("\n----------------------------------------------------------------------------");

			Comparator<String> compare = (String s1, String s2) -> s1.compareTo(s2);
			Arrays.sort(players2, compare) ;
			Arrays.asList(players2).forEach(System.out::println);
			
			System.out.println("\n----------------------------------------------------------------------------");
			Arrays.sort(players3, (String s1, String s2) -> s1.compareTo(s2)) ;
			Arrays.asList(players3).forEach(System.out::println);

	}
	
	
	
}
