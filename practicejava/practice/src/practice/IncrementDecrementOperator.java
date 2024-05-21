package practice;

public class IncrementDecrementOperator {
	public static void main(String[] args) {
		/*
		 * java increment operator ++ increses its operands value by one
		 * while decrement operator -- decreses its operands value by
		 * one as given below.*/
		int i =20;
		int j= 20;
		i++;
		j++;
		System.out.println("i = "+ i);
		System.out.println("j = "+ j);
		
	
	/*
	 * Increment and decrement operators can be used in two ways ,
	 * postfix(as given in above) and prefix
	 * In normal use,both forms behaves the same way .However , when they are
	 * part of expression, there is difference between two forms.
	 * 
	 * If prfix form is used , operand is incremented or decremented before 
	 * substituting its value.
	 * 
	 * One the other hand ,if postfix form is used,
	 * operands olld value is used to evaluate the expression.
	 * 
	 * simple example would be
	 * */
	/*
	 * here the value of i would be assigned to k and then its incremented 
	 * by one
	 */
		int k = i++;
		
		/*Here the value of j would be incremented first and then
		 *  assigned to k

	 * */
		int l =++j;
		System.out.println("k = "+ k);
		System.out.println("l = "+ l);
		

 
	
	}

}
