package week1.day2.assignments;

import java.util.Arrays;

public class ArraySecondSmallestNum {

	public static void main(String[] args) {
		
		int[] arr = {1,4,3,5,6,2,3,8};
		
		Arrays.sort(arr);
		
		int a = arr.length-2;
		
		System.out.println("The Second Smallest Number in the Array is "+arr[1]);
		System.out.println("The Second Largest Number in the Array is "+a);
	
		
	}
	
}
