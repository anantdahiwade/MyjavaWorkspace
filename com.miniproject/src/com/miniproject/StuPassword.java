package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StuPassword {

	

		public static void main(String[] args)  {
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
				//stmt = con.prepareStatement("insert into stupassword(StudentName,StudentPassword)values(?,?)");
				stmt = con.prepareStatement("update into where student2(StudentId)values(?)");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//by statement
			
			 try {
			stmt.setString(1, "ram");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			} 
			try {
				stmt.setString(2,"1234");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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



