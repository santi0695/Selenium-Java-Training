package week1.day2;

public class Calculator {

	public double sum(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public double mul(double a, double b) {
		return a * b;
	}

	public double div(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {

		Calculator Calc = new Calculator();

		double sum = Calc.sum(2, 2);
		System.out.println(sum);

		double sub = Calc.sub(2, 2);
		System.out.println(sub);

		double mul = Calc.mul(2, 2);
		System.out.println(mul);

		double div = Calc.div(2, 2);
		System.out.println(div);
	}
}
