package a;

public class Substraction {
	public int getSubstraction(int a, int b) {
		int c = a - b;
		return c;
	}
   public static void main(String[] args) {
	   Substraction substraction = new Substraction();
	   int sum = substraction.getSubstraction(10,20);
	   System.out.println("Substraction of tw numbers:" +sum);
	   
   }
}
