package com.test;

public class SwapNumber {
	public static void main(String [] args) {
		int a = 40;
		int b = 20;
		int temp;
		System.out.println("Before swapping");
		System.out.println("a : " + a + " & b :" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping");
		System.out.println("a : " + a +" & b :" + b);
		
	}

}
