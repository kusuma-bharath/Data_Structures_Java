package com.training.java;

import java.util.PriorityQueue;

public class PriorityQueue_Demo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(-6);
		pq.add(2);
		pq.add(9);
		pq.add(-23);
		pq.add(23);
		
		System.out.println("Printing : "+pq);
		
		System.out.println("Printing peeK: "+ pq.peek());
		System.out.println("Printing : "+pq);
		
		System.out.println("Printing peel: "+ pq.poll());
		System.out.println("Printing peel: "+ pq.poll());
		System.out.println("Printing peel: "+ pq.poll());
		System.out.println("Printing peel: "+ pq.poll());
		System.out.println("Printing peel: "+ pq.poll());
		System.out.println("Printing : "+pq);
		
	}
	
}
