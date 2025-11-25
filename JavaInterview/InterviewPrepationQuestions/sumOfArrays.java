import java.util.Arrays;
import java.util.Scanner;

public class sumOfArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) { 
        	nums[i] = sc.nextInt();
        }
     
        
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        sc.close();
        sumOfArrays s = new sumOfArrays();
        int[] array= s.twoSum(nums, target);
        System.out.println(Arrays.toString(array));
    }
    
    public int[] twoSum(int[] nums, int target) {
    	
    	for(int i = 0; i< nums.length; i++) {
    		for(int j = i+1; j < nums.length; j++) {
    			if(nums[j] == target - nums[i]) {
    				return new int[] {i, j};
    			}
    		}
    	}
    	
    	return new int[] {};
    }
}