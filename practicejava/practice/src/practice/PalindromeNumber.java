package practice;

class PalindromeNumber {
	// A palindrome number is a number that is same after reverse.
	//for example 545,151,23432,343,45654are the palindrome number
	public static void main(String[] args) {
		int e,sum =0,temp;
		int c=454;//it is the number variable to be checked for palindrome
		temp =c;
		while (c>0) {
			e=c%10;//getting remainder
			sum =(sum*10)+ e;
			c =c/10;
		}
		if(temp==sum)
			System.out.println("Is a Palindrome number ");
		else
			System.out.println("not palindrome");
	}

}
