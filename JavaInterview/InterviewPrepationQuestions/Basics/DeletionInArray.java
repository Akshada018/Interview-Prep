package Basics;

public class DeletionInArray {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int n = 5; // elements present in array
		int pos = 3; // elements to be delete at index(40)
		
		for(int i = pos; i < n-1; i++) {
			arr[i] = arr[i+1];
		}
		
		n--;
		
		System.out.print("After Deletion: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
