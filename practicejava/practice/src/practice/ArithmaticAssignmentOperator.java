package practice;

public class ArithmaticAssignmentOperator {
	public static void main(String[] args) {
/*
 * java provides shortcut operators to combine an arithmatic operator 
 * and assignment operator.
 * for example
 * i=i + 5;
 * can also be rewritten as
 * i+ =4;
 * */
	int i =5;
	int j =10;
	i +=5;    //same as i=i+5
	j -=2;// same as j=j-2
	System.out.println("i = "+i);
	System.out.println("j = "+j);
	
	}

}
