package a;

public class Addition {
	
	public int getaddition(int a, int b) {
		int c = a + b;
		return c;
		
	}
public static void main(String[] args) {
	Addition addition = new Addition();
	int sum =addition.getaddition(10,20);
	System.out.println("Addition of two number:" + sum);

}
}
