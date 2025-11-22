package Java8Features;

public class FindIndexesOfTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 8, 11, 6, 8 };

		int target = 10;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("Indexes: " + i + ", " + j);
				}
			}
		}

	}

}
