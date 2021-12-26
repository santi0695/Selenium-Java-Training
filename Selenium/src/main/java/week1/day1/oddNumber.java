package week1.day1;

public class oddNumber {
	

	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 */
	
	public static void main(String[] args) {
		
		int range = 20, i;
		
		System.out.println("The Odd Numbers are");
		
		for(i=1;i<=range;i++) 
		{
			
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
	}

}
