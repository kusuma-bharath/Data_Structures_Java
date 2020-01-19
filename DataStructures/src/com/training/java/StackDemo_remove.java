package com.training.java;

//Java code to illustrate remove() when position of 
//element is passed as parameter 

import java.util.*; 

public class StackDemo_remove { 
 public static void main(String args[]) 
 { 

     // Creating an empty Stack 
     Stack<String> stack = new Stack<String>(); 

     // Use add() method to add elements in the Stack 
     stack.add("Geeks"); 
     stack.add("for"); 
     stack.add("Geeks"); 
     stack.add("10"); 
     stack.add("20"); 

     // Output the Stack 
     System.out.println("Stack: " + stack); 

     // Remove the element using remove() 
     String rem_ele = stack.remove(4); 

     // Print the removed element 
     System.out.println("Removed element: "
                        + rem_ele); 

     // Print the final Stack 
     System.out.println("Final Stack: "
                        + stack); 
     
  // removeAllElementsing the Stack 
     // using removeAllElements() method 
     stack.removeAllElements(); 

     // Displaying the final Stack after removeAllElementsing 
     System.out.println("The final Stack after removeAllElements() : " + stack); 
     
 } 
} 