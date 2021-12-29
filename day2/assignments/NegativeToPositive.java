package week1.day2.assignments;

public class NegativeToPositive {
	
	public static void main(String[] args) {
		
		double a = 40.5;
		
		if (a<0) {
			double b = a*(-1);
			System.out.println("The Number "+a+" has been converted to "+b);
		} else {
			System.out.println("The Number "+a+" is already a positive number");
		}
		
	}

}
