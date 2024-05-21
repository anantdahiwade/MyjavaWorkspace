package com.inheritance;
import com.example2.LifeInsurance;
import com.example2.TermPolicy;

public class TestMain {
	public static void main(String[]args) {
		LifeInsurance insurance =new LifeInsurance();
		insurance.getifeInsuranceDetails();
		TermPolicy termPolicy= new TermPolicy();
		termPolicy.getTermPolicyDetails();
		
	}

	
}
