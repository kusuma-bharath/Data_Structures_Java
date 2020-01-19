package com.training.java;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < 5; i++)
			q.add(i * 10);

		System.out.println("Printing queue : " + q);

		// size of queue
		System.out.println("size of queue : " + q.size());

		int head = q.remove();

		System.out.println("Head of queue : " + head);

		System.out.println("Printing queue : " + q);

		int peek = q.peek();

		System.out.println("peek of queue : " + peek);

		System.out.println("Printing queue : " + q);

	}
}
