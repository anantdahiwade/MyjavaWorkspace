package com.miniproject;

import java.io.InputStream;
import java.util.Scanner;

public class StudentScore{
	
	

	public  void grade() {
		int marksObtained;char grade;
		 int passingMarks1 = 4;
		Scanner input = new Scanner(System.in);
		System.out.println("Marks obtained by you");
		marksObtained = input.nextInt();
		if (marksObtained >= passingMarks1 ) {
			if(marksObtained >=8)
			
				grade = 'A';
			else if(marksObtained >= 5)
				grade ='B';

			else if(marksObtained >= 3)
				grade ='C';

			else
			grade ='D';
		
			System.out.println("you are passed and your grade is =>" + grade);
		}else {
			grade ='F';
			System.out.println("you are failed and your grade is =>" + grade);
		}
		System.out.println("you are failed and your grade is =>" + grade);

	}}

	


