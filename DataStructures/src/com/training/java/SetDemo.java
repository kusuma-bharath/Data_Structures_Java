package com.training.java;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> values = new TreeSet<>(); //new HashSet<>();
		
		
		values.add(10);
		values.add(20);
		values.add(99);
		values.add(78);
		values.add(32);
		
		values.remove(32);
		
		
		
		System.out.println("Size of Set : "+values.size());
		
	
		for(Object p : values)
			System.out.println(p);
		
	}
}
