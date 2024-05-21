package com.miniproject;

import java.util.Scanner;

public class MyQuiz {   

private static String length;

/*1.	Store the 10 multiple choice questions related to java into database with correct answer.
2.	Out of these, user should able to presented random questions.
3.	One question has four options only.
4.	User will choose the answers.
5.	Also ability to store the multiple student score into database.
6.	System will display the result- it means what is the score out of 10.
7.	Also display the marks as below
Class A- 8-10
Class B- 6-8
Class C- 5
Class D- <5 then its fail.

8.	Display the list of student’s id, name with score into console as sorting order.
9.	To get the particular record by using student id only. If someone wants to retrieve theirs score from database.
Note- - 
1.	Use oops concepts, collection, string, exception handling and also try to use other concepts also as per developer point of view.
2.	Application should be tested end to end.
3.	This project needs to complete within mock group.

*/
	public static void main(String[] args ) {
		String answer1 ="";
		String answer2 ="";
		int score =0;
		Scanner scanner =new Scanner(System.in);
		int numberCorrect = 0;
		int questions = 4;
		
		System.out.println("1.java is ....... language."+"1: Insecure"+"2: Object oriented"+"3: Platform not independent"+"4: National");
		
		System.out.println("answer = ");
		answer1 = scanner.nextLine();
		if(answer1.equals("2")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			
			numberCorrect = numberCorrect +1;

		}
	
		
		System.out.println("2.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
	
		System.out.println("answer = ");	
		answer1 = scanner.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
		
		System.out.println("3.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
		
		System.out.println("answer = ");
		answer1 = scanner.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
		System.out.println("4.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
		
		System.out.println("answer = ");	
		answer1 = scanner.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
		System.out.println("5.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
		
		System.out.println("answer = ");
		answer1 = scanner.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
		System.out.println("6.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
		
		System.out.println("answer = ");	
		
		Scanner scanner1 =new Scanner(System.in);
		int numberCorrect1 = 0;
		int questions1 = 4;
		
		answer1 = scanner1.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
		System.out.println("7.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
		
		System.out.println("answer = ");
		answer1 = scanner.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
		System.out.println("8.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
		
		System.out.println("answer = ");
		answer1 = scanner.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
		System.out.println("9.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
		
		System.out.println("answer = ");
		answer1 = scanner.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
		System.out.println("10.java is ....... language."+"1: Insecure"+"2: Platform not independent"+"3: Object oriented"+"4: National");
		
		System.out.println("answer = ");
		answer1 = scanner.nextLine();
		if(answer1.equals("3")) {
			System.out.println("answer = correct answer");
			System.out.println("+1");

			numberCorrect = numberCorrect +1;
			score++;

		}else {
			System.out.println("answer = wrong answer");
			System.out.println("-1");
			numberCorrect = numberCorrect +1;

		}
	
		System.out.println("your score :" + score +"/"+numberCorrect);

		}
	
	}
		
		
		