package Basics;

public class InsertionInArray {

	public static void main(String [] args) {
		int[] arr = new int[6];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		int n = 4; //  current elements in array
		System.out.print("Before insertion: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		int pos = 3; // index where we will insert element
		
		int value = 25; // value we will insert
		
		
		//shift elements to right
		for(int i = n; i > pos; i--) {
			arr[i] = arr[i-1];
			
		}
		
		arr[pos] = value;
		n++;
		
		System.out.print("\nAfter insertion: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
