package a;

public class Subjects {
	public static void main(String[] args) {
		int maths =90;
		int english =90; 
		int science =80;
		int history =95;
		int geography =90;
		int total =maths + english + science +  history + geography;
		float avg = total/5;
				System.out.println("Total of five subjects: "+total);
		System.out.println("Average of five subject marks: "+ avg);
	}

}
