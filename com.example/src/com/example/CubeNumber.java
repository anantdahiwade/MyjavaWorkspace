package com.example;

import java.util.Scanner;

public class CubeNumber {
	public static int getNumberCube(int num) {
		int result = num * num * num;
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number>>");
		int number = scanner.nextInt();
		int result = getNumberCube(number);
		System.out.println("The Cube of number " + number + " is = " + result);
	}
	
}
