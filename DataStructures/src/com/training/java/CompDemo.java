package com.training.java;
import java.util.*;

public class CompDemo {

	public static void main(String[] args)
	{
		
		List <Integer> li = new ArrayList<>();
		 
		li.add(308);
		li.add(205);
		li.add(307);
		li.add(456);
		li.add(3232);
		li.add(192);
		li.add(1099);
		
		Collections.sort(li);
		
		for (Object p : li)
			System.out.print("Before Sort : "+ p+ " " );
		
		System.out.println();
		
		Comparator<Integer> c = new  CompImpl();
		
		//Collections.sort(li,c);
	
		//Collections.sort(li, (o1,o2) -> { if (o1%10 < o2%10) return 1; return -1;});
		
		//Comparator
		Collections.sort(li, (o1,o2) -> { return (o1%10 < o2%10) ? 1:-1 ;});
		

		for (Object q : li)
			System.out.print("After Sort : "+ q+ " " );
		
		
		/*for (int j=0; j<li.size();j++)
			System.out.print("Values : "+li.get(j)+ " ");*/
		
		
	}
	
}
