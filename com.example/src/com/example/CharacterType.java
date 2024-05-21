package com.example;
import java.util.Scanner;
//Assignment No.7 : Program -1
//Design method to check whether the character is alphabet,digit and special symbol.abstract 

public class CharacterType {
	
	 public static void charType(int ch) {
		if (ch >= 65 && ch <=90) {//Checking for Capital Alphabet ASCIT value to check type of character
			System.out.println("It's a capital letter alphabet");
			
		}else if (ch >= 97 && ch <= 122) {// Checking for small Alphabet ASCIT value to check type of character
			System.out.println("It's a small letter alphabet");
			
		}else if (ch >= 48 && ch <= 57) {// Checking for small Alphabet ASCIT value to check type of character
			System.out.println("It's a Number");
	}else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126)) {
		// Checking for small Alphabet ASCIT value to check type of character
		
			System.out.println("It's a special character");	
	}else {
			
			//if not a alphabet, number or special symbol then this symbol will execute
			System.out.println("Incorrect input");}
          }
		
public static void main(String[] args ) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the character to be checked");
	   
	   int ch = scanner.next().charAt(0);
	   charType(ch);
        }
}
	 
	 
	 
	 
	 
	 
