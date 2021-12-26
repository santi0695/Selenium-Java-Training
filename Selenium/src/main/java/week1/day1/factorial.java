package week1.day1;

public class factorial {

	
	public static void main(String[] args) {
		
		int a=5, i, fact = 1;
		
		for (i=1;i<=a;i++) {
			fact = i*fact;
			
		}
		System.out.println(fact);
	}
	
}
