package com.demo;

import java.util.Scanner;

public class ICICIBank extends Bank {
	public void getICICIBankDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the details of ICICI bank>> ");
		System.out.println("principal Amount>>");
		principleAmount =scanner.nextDouble();
		System.out.println("Tenure>>");
		tenure =scanner.nextInt();
		System.out.println("Rate of interest>>");
		rateOfInterest = scanner.nextFloat();
		System.out.println("Simple interest for ICICI bank>> " + getCalculateInterest(principleAmount,tenure,rateOfInterest));
		
	}
	private double getCalculateInterest(double principleAmount, int tenure,float rateOfInterest) {
		return((principleAmount*tenure*rateOfInterest)/100) ;
		
	}

}
