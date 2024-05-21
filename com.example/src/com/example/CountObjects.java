package com.example;

public class CountObjects {
	static int countObjects;
	CountObjects(){
		countObjects++;
	}
	
	public static void getObjectCount() {
		System.out.println("Number of objects in class: " + countObjects);
	}
	public static void main(String [] args) {
		CountObjects contObj1= new CountObjects();
		CountObjects contObj2= new CountObjects();
		CountObjects contObj3= new CountObjects();
		CountObjects contObj4= new CountObjects();
		CountObjects contObj5= new CountObjects();
		getObjectCount();


	}

}
