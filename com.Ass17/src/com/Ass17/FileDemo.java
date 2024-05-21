package com.Ass17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {
		int vowelcount =0;
		int numbercount =0;
		try {
			FileInputStream fileinputstream = new FileInputStream("C:/Users/Shree/Documents/docs/Tata is a big product.docx");
			Scanner scanner =new Scanner(fileinputstream);
			while (scanner.hasNextLine()){
				String s = scanner.nextLine();
				for(int i =0; i < s.length(); i++) {
					char ch =s.charAt(i);
					if(ch==65 || ch==69 || ch== 73 || ch ==79 || ch==85 ||ch == 97|| ch ==101 || ch ==105 || ch ==111 || ch ==117 ) {
						vowelcount++;
					}
					if(ch >= 48 && ch <= 57) {
						numbercount++;
					}
					
				}
				
			}
			System.out.println("Total Number of Vowels in file are>>" + vowelcount);
			System.out.println("Total Number of Numbers in file are>>" + numbercount);
			scanner.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}



//Assignment 17 done output is not getting correct