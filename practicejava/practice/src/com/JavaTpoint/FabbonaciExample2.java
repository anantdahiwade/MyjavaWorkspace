package com.JavaTpoint;
//Using recursion
class FibbonaciExample2 {
static int n1 =0,n2=1,n3 =0;
static void printFibbonacci(int count) {
	if(count>0) {
		n3 =n1+n2;
		n1 =n2;
		n2=n3;
		System.out.print(""+n3);
		printFibbonacci(count-1);
	}
}
public static void main(String[] args) {
	int count =10;
	System.out.print(n1+""+n2);//printing 0  and 1
	printFibbonacci(count-2);//n-2 because 2 numbers are already printed
}
}
