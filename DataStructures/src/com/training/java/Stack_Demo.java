package com.training.java;

//Java code to demonstrate empty() method 
import java.util.*; 

public class Stack_Demo { 
 public static void main(String[] args) 
 { 

     // Creating an empty Stack 
     Stack<String> STACK = new Stack<String>(); 

     // Stacking strings 
     STACK.push("Geeks"); 
     STACK.push("4"); 
     STACK.push("Geeks"); 
     STACK.push("Welcomes"); 
     STACK.push("You"); 

     // Displaying the Stack 
     System.out.println("The stack is: " + STACK); 

     //size of stack
     System.out.println("Size of stack : " + STACK.size());
     

     //capacity of stack
     System.out.println("Capacity of stack : " + STACK.capacity());
     
     for (String p : STACK)
    	 System.out.println(p);
     
  // Checking for the element "4" 
     System.out.println("Does the stack contains '4'? "
                                  + STACK.search("4")); 
     // Checking for the element "Hello" 
     System.out.println("Does the stack contains 'Hello'? "
                                  + STACK.search("Hello")); 

     // Checking for the element "Geeks" 
     System.out.println("Does the stack contains 'Geeks'? "
                                  + STACK.search("Geeks")); 

 
     // Checking for the emptiness of stack 
     System.out.println("Is the stack empty? " +  
                                   STACK.empty()); 

     // Popping out all the elements 
     STACK.pop(); 
     STACK.pop(); 
     STACK.pop(); 
     STACK.pop(); 
     STACK.pop(); 
     
     if (STACK.empty()) 
     // Checking for the emptiness of stack 
     System.out.println("Is the stack empty? " +  
                                  STACK.empty()); 
 } 
} 