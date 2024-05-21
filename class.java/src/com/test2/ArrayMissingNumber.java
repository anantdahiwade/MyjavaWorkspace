package com.test2;
/* 2. Suppose you have array that containing elements 10,20,30,10, 
30,50,60 
* Find out duplicate elements into array and print it.
*/

public class ArrayMissingNumber {//main method
	public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 6, 3, 7, 8, 9};//array declaration and initialization
		
		int size =a.length;//storing array length in variable
			
		for ( int num = 1; num <= size; num++) {//checking number from 1 to max in array
			
			int count = 0;//variable count the occurance of number
			
			for(int j = 0; j < size; j++) {//a loop to compare each array element
				
				if(num == a[j]) {//condition to check number present with array element
				count++;	
					
					
				}
				
			}
			if(count == 0) {//if the number is not present i.e count is zero
				System.out.println("Missing number is>>  " + num);
				//print the number
			}
		}
		
	}//missing number in array done

}
