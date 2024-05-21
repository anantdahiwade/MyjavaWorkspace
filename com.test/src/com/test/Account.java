package com.test;
import java.util.Scanner;

public class Account {
	static int accountNumber;
	static String accountName;
	public static void getAccountDetails() {
		System.out.println("Enter the account number>>");
		Scanner scanner =new Scanner(System.in);
		accountNumber =scanner.nextInt();
		System.out.println("Enter the account holder name");
		accountName = scanner.next();
		getAccountInformation(accountNumber,accountName);
		
	}
	private static void getAccountInformation(int accountNumber, String accountName) {
		System.out.println("Acount Number: " + accountNumber);
		System.out.println("Acoount Name: " + accountName);
		
	}

}
