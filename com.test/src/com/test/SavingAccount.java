package com.test;

import java.util.Scanner;

public class SavingAccount extends Account{
	static String accountType = "Saving";
	long balance;
	public void getSavingAcoountDetails() {
		System.out.println("Total balance is>>");
		Scanner scanner =new Scanner(System.in);
		balance = scanner.nextInt();
		getSavingAccountInformation(balance);
	}
	private void getSavingAccountInformation(long balance) {
		System.out.println("Account Type: " +accountType);
		System.out.println("Balance: "+balance);
		
	}
	public void getSavingAccountDetails() {
		
	}
	

}
