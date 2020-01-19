package com.training.java;

import java.util.*; 

public class StackDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty Stack 
        Stack<String> STACK = new Stack<String>(); 
  
        // Use add() method to add elements 
        STACK.push("Welcome"); 
        STACK.push("To"); 
        STACK.push("Geeks"); 
        STACK.push("For"); 
        STACK.push("Geeks"); 
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + STACK); 
  
        // Removing elements using pop() method 
        System.out.println("Popped element: " +  
                                         STACK.pop()); 
        System.out.println("Popped element: " +  
                                         STACK.pop()); 
  
     // Fetching the element at the head of the Stack 
        System.out.println("The element at the top of the"
                           + " stack is: " + STACK.peek()); 
        
        // Displaying the Stack after pop operation 
        System.out.println("Stack after pop peration "
                                             + STACK); 
    } 
} 