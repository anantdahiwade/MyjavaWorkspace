package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws SQLException {
		try {
			//add the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		//make the connection(url,hostname,DB name,username,password)
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student2","root","root");
		//sql query

		String sql ="insert into student2(StudentName,StudentCity)values('Lakhan','Pune')";
		//by statement
		Statement stmt =con.createStatement();
		stmt.execute(sql);
		System.out.println("Record Inserted Successfully");
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
