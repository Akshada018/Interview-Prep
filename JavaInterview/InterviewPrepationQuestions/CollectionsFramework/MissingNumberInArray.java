package CollectionsFramework;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,5,6,7,8};
		
		int n = arr[arr.length - 1];	// 8
		int expectedSum = n*(n+1)/2;
		
		int actualSum = 0;
		
		for(int num : arr) {
			actualSum += num;
		}
		
		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing number from array: "+missingNumber);

	}

}
