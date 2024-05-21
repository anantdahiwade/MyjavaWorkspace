package practice;

public class LeapYear {
	public static void main(String[] args) {
		//year we want to check is 2020
		int year =2020;
		//if year is divisible by 4,it is a leap year
		if((year % 400==0)||((year % 4 ==0)&&(year % 100 !=0)))
			System.out.println("year "+ year +" is a leap year");
		else 
			System.out.println("year "+ year+" is not a leap year"); 
	}

}
