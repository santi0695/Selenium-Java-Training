package week3.day1.classroom2;

public class Calculator {
	
	public void add(int num1, int num2) {
		System.out.println("The Sum of two numbers is "+(num1+num2));
	}

	public void add(int num1, int num2, int num3) {
		System.out.println("The Sum of three numbers is "+(num1+num2+num3));
	}

	public void subtract(int num1, int num2) {
		System.out.println("The difference of two numbers is "+(num1-num2));
	}
	
	public void subtract(double num1, double num2) {
		System.out.println("The difference of two numbers is "+(num1-num2));
	}
	
	public void multiply(int num1, int num2) {
		System.out.println("The product of two numbers is "+(num1*num2));
	}
	
	public void multiply(int num1, double num2) {
		System.out.println("The product of two numbers is "+(num1*num2));
	}
	
	public void divide(int num1, int num2) {
		System.out.println("The division of two numbers is "+(num1/num2));
	}
	
	public void divide(double num1, int num2) {
		System.out.println("The division of two numbers is "+(num1/num2));
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.add(3, 5);
		cal.add(5, 8, 90);
		cal.subtract(50.5, 10.6);
		cal.subtract(90, 11);
		cal.multiply(5, 6);
		cal.multiply(7, 8.5);
		cal.divide(60, 10);
		cal.divide(66.5, 10);
		
		
	}
}
