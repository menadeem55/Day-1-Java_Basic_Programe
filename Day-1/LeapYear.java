package com.java.day1;
import java.util.Scanner;
public class LeapYear {

 // Leap Year Program 
 // 1. century (100%=0 and 400%=0)	
 // 2. yearly (100%!=0 and 4%=0)	
public static void main(String[] args) {

	int y;
	System.out.println("Enter any Year ");
	Scanner sc=new Scanner(System.in);
	y=sc.nextInt();
	if( y>=1582) {
		
	if(y%400==0  || y%100!=0 && y%4==0)
		
	{
		System.out.println("This is Leap Year");
	}
	else {
		System.out.println("This is not a Leap Year");
	}
	
	}
	else {
	System.out.println("False");
	}
}

}