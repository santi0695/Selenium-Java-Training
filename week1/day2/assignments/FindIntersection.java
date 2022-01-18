package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {

		int[] arr1 = { 12, 23, 24, 34, 56, 12 };
		int[] arr2 = { 1, 21, 45, 56, 12, 11, 1 };

		int i, j;

		for (i = 0; i < arr1.length; i++) {
			int a, b = 0;
			a = arr1[i];

			for (j = 0; j < arr2.length; j++) {

				b = arr2[j];
				if (b == a) {
					System.out.println("The intersection in both arrays is " + b);

				}
			}

		}
	}
}
