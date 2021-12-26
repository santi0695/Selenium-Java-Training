package week1.day2;

public class MyCalculator {

	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		double sum = cal.sum(2, 2);
		System.out.println(sum);

		double sub = cal.sub(2, 2);
		System.out.println(sub);

		double mul = cal.mul(2, 2);
		System.out.println(mul);

		double div = cal.div(2, 2);
		System.out.println(div);
	}
}
