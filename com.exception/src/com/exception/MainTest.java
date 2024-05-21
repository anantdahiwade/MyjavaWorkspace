package com.exception;

import java.util.Scanner;

public class MainTest {
     public static void main(String[] args) {
	 Product product =new Product();
	 Scanner scanner =new Scanner(System.in);
	 System.out.println("Enter the product weight>>");
	 int productWeight =scanner.nextInt();
	 try {
		 product.productCheck(productWeight);
	 }catch (ProductException e) {
		 System.out.println(e);
	 }
}
	

}
