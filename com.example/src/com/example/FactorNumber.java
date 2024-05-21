package com.example;
import java.util.Scanner;

public class FactorNumber {
	public static void getFactors(int number) {
		int i = 1;
		while(i <= number)
		{
			if (number % i == 0) 
			{
				System.out.println(i);
				
			}
			i++;
		}
		
	}
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner scanner = new Scanner(System.in);
	int number =scanner.nextInt();
	System.out.println("The factors of " + number +"are ");
	getFactors(number);
}
	
}


