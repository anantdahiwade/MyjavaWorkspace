package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Quiz1{

	
   public static void main(String[] args) {
	   System.out.println("Enter the StudentId :");
	   
	   
	   System.out.println("				Exam started				");	
	
		String x1 ="		1.Number of primitive data types in Java are?\r\n" + 
				 
				""
					+"		a.6,b.7,c.8,d.9\n" + "your Answer :";
		String x2 ="		2.What is the size of float and double in java?\r\n" + 
				 
				""
					+"		a.32 and 64,b.32 and 32,c.64 and 64,d.64 and 32\n" + "your Answer : ";
		String x3 ="		3.What is the size of float and double in java?\r\n" + 
				
				""
					+"		a.Byte to int,b.int to long,c.Long to int,d.Short to int\n" + "your Answer : ";
		String x4 ="		4.When an array is passed to a method, what does the method receive?\r\n" + 
				
				""
					+"		a.The reference of the array,b.a copy of the array,c.Length of the array,d.Copy of first element\n" + "your Answer : ";
		String x5 ="		5.Arrays in java are-\r\n" + 
				
				""
					+"		a.Object references,b.Objects,c.Primitive data types,d.None\n" + "your Answer :";
		String x6 ="		6.When is the object created with new keyword?\r\n" + 
				
				""
					+"		a.At run time,b.At compile time,c.Depends on the code,d.None\n" + "your Answer : ";
		String x7 ="		7.Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.\r\n" + 
			
				""
					+"		a.final,b.static,c.volaile,d.abstract\n" + "your Answer : ";
		String x8 ="		8.In which of the following is toString() method defined?\r\n" + 
				
				""
					+"		a.java.lang.Object,b.java.lang.String,c.java.lang.util,d.None\n" + "your Answer :";
		String x9 ="		9.To which of the following does the class string belong to.\r\n" + 
			
				""
					+"		a.java.lang,b.java.awt,c.java.applet,d.java.string\n" + "your Answer : ";
		String x10 ="		10.Total constructor string class have?\r\n" + 
			
				""
					+"		a.3,b.4,c.13,d.15 ";
		Qs[] questions = {
				
			new Qs(x1,"c"),
			new Qs(x2,"a"),
			new Qs(x3,"b"),
			new Qs(x4,"a"),
			new Qs(x5,"b"),
			new Qs(x6,"a"),
			new Qs(x7,"b"),
			new Qs(x8,"a"),
			new Qs(x9,"a"),
			new Qs(x10,"c"),
			
		};
		test(questions);
	}
	public static void test(Qs[] questions) {
		int score =0;
		Scanner input =new Scanner(System.in);
		for (int i =0; i< questions.length;i++){
			System.out.println(questions[i].question);
			String answer = input.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("...............................*Exam End*................................."
				);
			System.out.println("your have got "+score +"/"+questions.length);

	try {
		//add the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	//make the connection(url,hostname,DB name,username,password)
	Connection con = null;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StuPassword","root","root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//sql query

	PreparedStatement stmt = null;
	try {
		//stmt = con.prepareStatement("insert into stupassword(StudentName,StudentPassword)values(?,?)");//correct method
		stmt = con.prepareStatement("update into column where student2.student2(StudentId,score) values(StudentId,?)");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	try {
		stmt.setString(2, "10");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	//try {
	//	int score1=0;
	//	stmt.setString(3,""+score);
	//} catch (SQLException e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
	//}
	
	int i = 0;
	try {
		i = stmt.executeUpdate();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
	
	//Statement stmt =con.createStatement();
	//stmt.execute(sql);
	System.out.println("Record Inserted Successfully"+i);
	
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		stmt.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
	
	}

