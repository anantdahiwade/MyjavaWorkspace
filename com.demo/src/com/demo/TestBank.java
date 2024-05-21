 package com.demo;

public class TestBank {
	public static void main(String[]args) {
	
	ICICIBank iciciBank = new ICICIBank();
	iciciBank.getICICIBankDetails();
	HDFCBank hdfcBank =new HDFCBank();
	hdfcBank.getHDFCDetails();
	SBIBank sbiBank =new SBIBank();
	sbiBank.getSBIDetails();
    }
	

}
