package week1.day2;


public class ArmstrongNumber {
	

	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 */

	public static void main(String[] args) {

		
		int input = 153, calculated = 0;
		
		int rem, originalNum = input;
		
		
		while(input>0) {
			rem = input % 10;
			calculated = calculated + (rem*rem*rem);
			
			input = input / 10;
		}
	
	    if (calculated == originalNum) {
	    	System.out.println("This is Armstrong Number");
	    }
	    else 
	    {
	    	System.out.println("This is not an Armstrong Number");
	    }
	
		}



}