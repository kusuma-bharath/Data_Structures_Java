package com.training.java;


import java.util.*;

public class MapDemo {
	
	public static void main(String[] args) {
		
		//Map <String,String> map = new HashMap<>(); // insertion order is not fixed
		//Map <String,String> map = new Hashtable<>(); // insertion order is not fixed
		
		Map <String,String> map = new LinkedHashMap<>(); // insertion order is  fixed
		
		
		//Map <String,String> map = new TreeMap<>(); // elements are sorted
		
		map.put("My_name","Bharath");
		map.put("college","UF");
		map.put("school","SR");
		map.put("inter","Chaitanya");
		
		System.out.println(map);
		
		Set<String> s = map.keySet();
		
		for (String p : s)
			System.out.println( "Key : " +p  + " " +"value : "+ map.get(p));
		
		
		Set<Map.Entry<String,String>> values = map.entrySet();
		
		for ( Map.Entry<String,String> z : values)
			System.out.println("get Key :"+ z.getKey() + " -- get value : "+z.getValue());
		
		
		
	}

}
