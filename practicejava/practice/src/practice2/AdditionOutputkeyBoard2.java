package practice2;

import java.util.Scanner;

public class AdditionOutputkeyBoard2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sr =new Scanner(System.in);
		System.out.println("Enter any two number :"+" ");
		a = sr.nextInt();
		b = sr.nextInt();
		c = a+b;
		System.out.println("SUM: " + c);
	}

}
