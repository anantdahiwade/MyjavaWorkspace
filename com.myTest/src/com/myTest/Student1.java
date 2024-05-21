package com.myTest;

public class Student1 {
	static int a=10;
	public static void main(String[] args) {
		Student1 stu = new Student1();//object creation call
		System.out.println(Student1.a);//by object creation
		System.out.println(a);//by name
	
		System.out.println(Student1.a);//class name
	}

}
// variables