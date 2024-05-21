package com.test.example;

public class PolicyTest {
	public static void main(String[] args) {
		Policy policy = new Policy();
		Policy policies = policy.getPolicyDetails();
		System.out.println("Policy data is>>" +policies);
		
	}

}
