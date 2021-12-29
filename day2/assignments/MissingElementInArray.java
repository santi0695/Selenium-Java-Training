package week1.day2.assignments;

public class MissingElementInArray {

	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,7,8};
		
		int a = arr.length+1;
		int sumTotal = (a * (a+1))/2;
		int arrTotal=0;
		
		for(int i=0;i<arr.length; i++) {
			
			arrTotal = arrTotal + arr[i];
			
		}
		
		System.out.println("The Missing Element in the Array is "+(sumTotal-arrTotal));
		
	}
}
