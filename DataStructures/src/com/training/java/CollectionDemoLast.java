package com.training.java;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemoLast {

	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(34,35,36);
		
		//Double braces initialization
		List<Integer> list = new ArrayList<>()
				{{
					add(34);
					add(34);
					add(34);
				}};
		
		
		for(int x : list)
		System.out.println(x);
		
	}
}
