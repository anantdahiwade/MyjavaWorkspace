package com.inheritance;

import java.util.Scanner;

public class AccountDetails {
private static int currentBalance;

public void getAccountDetails() {
	System.out.println("Enter the Id>>");
	Scanner scanner = new Scanner(System.in);
	int id = scanner.nextInt();
	System.out.println("Enter the account number>>");
	Long accountNumber = scanner.nextLong();
	System.out.println("Enter the balance>>");
	int balance = scanner.nextInt();
	Account account = new Account();

	account.setId(id);
	account.setAccountNumber(accountNumber);
	account.setBalance(balance);
	getWithdrawDetails(account);

}

private static int getWithdrawDetails(Account account) {
	int currentBalance = 0;
	System.out.println("Enter the amount for withdrawl>>");
	Scanner scanner = new Scanner(System.in);
	int withdrawAmount =scanner.nextInt();
	if(account.getBalance() > withdrawAmount) {
		currentBalance = account.getBalance() -withdrawAmount;
			
	}
	System.out.println("Your current account balance is>>" + currentBalance);
	return currentBalance;
	
	
}
}
