package com.example1;

import java.util.Scanner;

public class EmployeeInformation {
public void getUserInput() {
	
	Employee employee = new Employee();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter  the first name>>");
	employee.firstName = scanner.nextLine();
	
	System.out.println("Enter the last name");
	employee.lastName =scanner.nextLine();
	
	System.out.println("Enter the city");
	employee.city = scanner.nextLine();
	
	System.out.println("Enter the mobile number>>");
	employee.mobileNumber = scanner.nextLong();
	
	getStudentInformation(employee.firstName,employee.lastName,employee.city,employee.mobileNumber,employee.country );
	
}

public void getStudentInformation(String fName, String lName, String city, long mobNum, String country) {
	
	System.out.println("Student Information");
	System.out.println("First Name: " + fName);
	System.out.println("Last Name: " + lName);
	System.out.println("City: " + city);
	System.out.println("MobileNumber: " + mobNum);
	System.out.println("Country: " + country);
	
}

    public static void main(String [] args) {
    	EmployeeInformation employeeInformation = new EmployeeInformation();
    	System.out.println("Enter the number of student>>");
    	Scanner input = new Scanner(System.in);
    	int count = input.nextInt();
    	
    	for(int i = 1; i <=count;i++) {
    		System.out.println("Enter the Student details>>");
    		employeeInformation.getUserInput();
    	}
    }
}
