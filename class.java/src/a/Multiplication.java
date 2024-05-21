package a;

public class Multiplication {
	public int getmultiplication(int a, int b) {
		int c=a*b;
		return c;
	}
   public static void main (String[] args) {
	   Multiplication multiplication =new Multiplication();
	   int sum =multiplication.getmultiplication(10,20);
	   System.out.println("multiplication of two nombers: " + sum);
   }
}
