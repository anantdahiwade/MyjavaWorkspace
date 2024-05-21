package a;

public class Division {
	public int getDivision(int a, int b) {
		int c=a/b;
		return c;
	}
    public static void main (String[] args) {
	   Division division =new Division();
	   int sum =division.getDivision(60,20);
	   System.out.println("multiplication of two numbers: " + sum);
   }

}
