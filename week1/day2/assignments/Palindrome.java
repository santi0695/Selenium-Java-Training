package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {

		int originalNum = 12344321, rem, reversedNum = 0;

		int num = originalNum;

		while (num != 0) {
			rem = num % 10;
			reversedNum = reversedNum * 10 + rem;
			num = num / 10;
		}

		if (reversedNum == originalNum) {

			System.out.println("The Number is Palindrome");

		} else {
			
			System.out.println("The Number is not Palindrome");
			
		}
	}

}
