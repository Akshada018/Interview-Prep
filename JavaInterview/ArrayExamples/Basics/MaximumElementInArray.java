package Basics;

public class MaximumElementInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 56, 74, 8, 27, 95 };

		int max = max(arr);

		System.out.print("Max = " + max);

	}

	public static int max(int[] arr) {
		int n = arr[0];

		for (int i : arr) {
			if (i > n) {
				n = i;
			}
		}
		return n;
	}
}
