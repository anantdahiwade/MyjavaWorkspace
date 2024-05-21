package com.assignment6;

public class Factorial {
	public int factorial(int number) {
		int fact = 1;
		
		for (int i = 1; i <= number; i++) {
			fact = fact*i;
		}
		return fact;
		
	}
	
	public static void main (String [] args) {
		Factorial factorial = new Factorial();
		int result = factorial.factorial(5);
		System.out.println("The factorial of given number is >> " + result);
		

	}}
