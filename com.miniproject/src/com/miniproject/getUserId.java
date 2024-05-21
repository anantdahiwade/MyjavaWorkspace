package com.miniproject;

import java.util.Scanner;

public class getUserId {
	public static void main(String[] args) {
		 int a = 10;
		 int s = 9;
		 int b = 8;
		
		Scanner id =new Scanner(System.in);
		System.out.println("enter a String ");
		s = id.nextInt();
		System.out.println("you entered string " + s);
		System.out.println("enter an correct");
		a =id.nextInt();
		System.out.println("you entered integer " + a);
		System.out.println("enter float " + a);
		b =id.nextInt();
	
	}

}
