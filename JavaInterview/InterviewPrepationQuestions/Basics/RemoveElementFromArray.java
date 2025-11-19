package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array : ");
			int size = sc.nextInt();
			int input[] = new int[size];

			System.out.println("Enter number to remove from input array : ");
			int numToRemove = sc.nextInt();

			for (int i = 0; i < size; i++) {
				input[i] = sc.nextInt();
			}

			sc.close();
			int count = removeElement(input, numToRemove);

//			System.out.print("Count after removal of element : " + count);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int removeElement(int[] nums, int val) {
		try {
//			int[] removedNums = new int[nums.length];
			int k = 0;
			//Approach 1
//			for (int i = 0; i < nums.length; i++) {
//				if (nums[i] != val) {
//					nums[k] = nums[i];
//					k++;
//				}
//			}

			//Approach 2
			for(int i : nums) {
				if(i != val) {
					nums[k] = i;
					k++;
				}
			}
			
			int[] resultArray = Arrays.copyOf(nums, k);

			System.out.println(Arrays.toString(resultArray));

			return k;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
