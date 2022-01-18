package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		int i, j, count;

		for (i = 0; i < arr.length; i++) {
			count = 0;
			int num1 = arr[i];

			for (j = i + 1; j < arr.length; j++) {
				int num2 = arr[j];
				if (num1 == num2) {
					count = count + 1;
				}
			}
			if (count > 0) {
				System.out.println("Duplicate Value is " + arr[i]);
			}
		}

	}

}
