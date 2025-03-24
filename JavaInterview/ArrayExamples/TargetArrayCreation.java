// Question. Given two arrays of integers nums and index. Your task is to create target array under the following rules:

// Initially target array is empty.
// From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
// Repeat the previous step until there are no elements to read in nums and index.
// Return the target array.

// It is guaranteed that the insertion operations will be valid.

//Solution:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TargetArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];

        System.out.println("Enter elements for nums array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter elements for index array: ");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        sc.close();

        int[] result = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (index[i] > list.size()) {
                System.out.println("Error: index[" + i + "] = " + index[i] + " is out of bounds. Skipping...");
                continue;
            }
            list.add(index[i], nums[i]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}