package week1.day2.assignments;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int a = 29, i;
		boolean r = false;
		
		for (i=2;i<a;i++) {
			
			
			
			if (a%i==0) {
				System.out.println("The Number is not a Prime Number");
				break;
			} else {
				r= true;
			}
		}
		if(r==true) {
			System.out.println("The Number is a Prime Number");
		}
		
	}
	

}
