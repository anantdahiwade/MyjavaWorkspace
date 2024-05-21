package com.abstraction;
import java.util.Scanner;

public class AccountImpl implements Account {

	@Override
	public void getSavingAccount() {
		String name;
		float balance;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Name of the Account Holder>>");
		name =scanner.next();
		System.out.println("Enter balance of the Accoun Holder>>");
		balance = scanner.nextFloat();
		getUserDetails(name,balance);
	}

	@Override
	public void getUserDetails(String name, float balance) {
		System.out.println("Account User Name is>> " + name);
		System.out.println("Account balance is>>" + balance)  ;
	}
	public void main(String[]args) {
		AccountImpl accountImpl =new AccountImpl();
		accountImpl.getSavingAccount();
	}
	

}
