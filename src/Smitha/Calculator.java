package Smitha;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
      int a,b;
      System.out.println("Enter the operation to be performed");
      Scanner scanner = new Scanner(System.in);
      String operation= scanner.nextLine();
      
      System.out.println("Enter first number: ");
  	  a= scanner.nextInt();
  	
  	  System.out.println("Enter second number: ");
  	  b= scanner.nextInt();
   
    if(operation.equals("add")) {
    	System.out.println("Addition of a and b is " + (a+b));
      }
    else if(operation.equals("subtract")) {
    	System.out.println("Subtraction of a and b is " + (a-b));
    }
    else if(operation.equals("multiply")) {
    	System.out.println("Multiplication of a and b is " + (a*b));
    }   
      
    else if(operation.equals("division")) {
    	System.out.println("Division of a and b is " + (a/b));
    }
    scanner.close();
	}
   
}
