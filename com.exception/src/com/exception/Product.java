package com.exception;

public class Product {
	public void productCheck(int weight) {
		
		if (weight < 100) {
			throw new ProductException("Invalid weight,weight must be above 100.");
			
		}
		
	}


}
//public void productCheck(int weight) {
//if(weight < 100) {
	//throw new Exception("Invalid weight,weight must be above 100.");
//}
//}
//problem

