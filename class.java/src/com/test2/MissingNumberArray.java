package com.test2;
//assignment 18 done
//* 1. Suppose You have given an integer array containing 1 to n but 
//one of 
//* the number from 1 to n in the array is missing. You need to provide 
//* optimum solution to find the missing number. Number can not be 
//repeated 
//* in the array.


public class MissingNumberArray {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 30, 50, 60};//array declared and initialized
		System.out.println("Dublicate numbers are>> ");
		for(int i =0; i< a.length; i++) {
			for( int j = 1 + i; j < a.length; j++){
				
				if(a[i] == a[j]) {//check one element to other element for duplicasy
					System.out.println(a[i]);//printing the duplicate number
					
				}
			}
		}
	}

}
