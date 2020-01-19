package com.training.java;

import java.util.*;

public class GenericsDemo {

	public static void main(String[] args) {

		Collection value = new ArrayList();

		value.add(3);
		value.add("Bharath");
		value.add(5.6f);

		// old Technique
		Iterator i = value.iterator();

		while (i.hasNext()) {
			System.out.println("Using Iterator while loop : " + i.next());

		}

		// enhanced for loop

		for (Object p : value) {
			System.out.println("Using enhanced for loop : " + p);
		}

		// Generics Demo
		Collection<Integer> valInt = new ArrayList<>();

		valInt.add(3);
		valInt.add(5);
		valInt.add(8);

		valInt.remove(5); // to remove an element

		// for (Object x : valInt)
		for (int x : valInt) // Since we know the type of values collection holds
			System.out.println("Generics Demo : " + x);

		List<Integer> values = new ArrayList<>();

		values.add(46);
		values.add(5);
		values.add(54);
		values.add(-5);

		values.add(1, 69); // Since List extends Collection and List is implemented by ArrayList

		values.add(5, 19); // Since List extends Collection and List is implemented by ArrayList

		Collections.sort(values); // Collections is a new class with which we can do sorting

		System.out.println(values);

		System.out.println(values.get(1));
		System.out.println(values.get(0));

		for (Object y : values)
			System.out.println("Enhanced for loop List : " + y);

	}

}
