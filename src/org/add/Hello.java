package org.add;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num = sc.nextInt();
	   
	   if (num % 2==0) {
		   System.out.println("The given number is Even");
	   }
	   else {
		   System.out.println("The given number is Odd");
	   }
	    }
}