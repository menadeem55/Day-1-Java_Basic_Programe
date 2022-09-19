package com.java.day1;
import java.util.Scanner;
public class StringEqualorNot {

	public static void main(String args[])
	{

	System.out.println("Enter the First String Name: ");
								
	Scanner sc = new Scanner(System.in);	//checking object
	String name1 = sc.nextLine();
	
	System.out.println("Enter the Second String: ");
	
	String name2 = sc.nextLine();
	
	System.out.println("\nAre both string same: ");
	
	if (name1.equals(name2) == true) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}	 


	}

	}
