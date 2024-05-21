package com.test1;

import java.util.Scanner;

public class ArmStrongNumber {
	public boolean ArmstrongNumber(int input) {
		int tempValue = input;
		int sum = 0;
		while(input != 0) {
			int remainder =input % 10;
			sum = sum + (remainder*remainder*remainder);
			input = input / 10;
		}
		if(sum == tempValue)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		ArmStrongNumber armStrongNumber = new ArmStrongNumber();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Check the below number is Armstrong or not.");
		System.out.println("Enter the number: ");
		int  value = scanner.nextInt();
		if (armStrongNumber.ArmstrongNumber(value))
			System.out.println(value + " is armstrong number.");
		else
			System.out.println(value + " is not armstrong number");
	}

}
