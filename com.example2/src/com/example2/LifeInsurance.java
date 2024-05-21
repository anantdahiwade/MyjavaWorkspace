package com.example2;

import java.util.Scanner;

public class LifeInsurance extends Insurance {
	int premiumAmount;
	public int getPremiumAmount() {
		return premiumAmount;
		
	}
	public void getifeInsuranceDetails() {
		System.out.println("Enter te Insurance details>>");
		Scanner scanner = new Scanner(System.in);
		premiumAmount =scanner.nextInt();
		LifeInsurance lifeInsurance = new LifeInsurance();
		lifeInsurance.setPremiumAmount(premiumAmount);
		getLifeInsuranceInformation(lifeInsurance);
	}
	
	private void setPremiumAmount(int premiumAmount) {
		
	}
	private void getLifeInsuranceInformation(LifeInsurance lifeInsurance ) {
		System.out.println("Premium Amount is>>" +lifeInsurance.getPremiumAmount());
		
		
	}
	

}
