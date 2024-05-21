package practice;

public class CalculateArrayAverage21 {
	public static void main(String[] args) {
		//define an array
		int[] numbers =new int[] {10,20,30,40,50,60,70,80};
		/*
		 * average value of array elements would be
		 * sum of all elements/total number of elements
		 * */ 
		//Calculate sum of all array elements
		int sum =0;
		for(int i =0; i< numbers.length;i++)
			sum =sum+numbers[i];
	//Calculate average value
		double average =sum /numbers.length;
		System.out.println("Average value of Array elements is :" + average);
	}

}
