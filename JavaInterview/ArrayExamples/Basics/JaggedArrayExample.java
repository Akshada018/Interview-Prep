package Basics;

public class JaggedArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[2][];

		// making above array as jagged

		arr[0] = new int[3];
		arr[1] = new int[2];

		// Initializing an array

		int count = 0;

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}

	}

}
