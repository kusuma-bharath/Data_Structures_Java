package com.training.java;

import java.util.*;

public class VectorDemo {
	public static void main(String[] args) {

		// Vector --> Dynamic array

		// ArrayList <Integer> v = new ArrayList <Integer> (); // 50% memory increase //
		// Not Threadsafe // fast

		Vector<Integer> v = new Vector<Integer>(); // 100% memory increase // synchronized threadsafe // slow

		v.add(21);
		v.add(22);
		v.add(23);
		v.add(24);
		v.add(25);
		v.add(26);
		v.add(27);
		v.add(28);
		v.add(29);
		v.add(30);
		v.add(12);
		v.add(52);
		v.add(62);
		v.add(72);

		System.out.println("Printing Vector size : " + v.size());
		System.out.println("Printing Vector capacity : " + v.capacity());

		v.remove(0);

		v.add(0, -21);

		for (int i : v)
			System.out.println(i);

	}
}
