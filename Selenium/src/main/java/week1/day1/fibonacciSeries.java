package week1.day1;

public class fibonacciSeries {
	
	
	public static void main(String[] args) {
		int i, firstNum = 0, secNum = 1, range = 8, sum;
		
		System.out.println("The fibonacci series is as follows");
		System.out.println(firstNum);
		
		for(i=0;i<=range;i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
	}

}
