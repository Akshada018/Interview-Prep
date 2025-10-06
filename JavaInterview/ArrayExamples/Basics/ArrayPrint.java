package Basics;

public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 45, 6 };

		int size = arr.length;

		System.out.println(size);

		System.out.println("HashCode: " + arr.hashCode());

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " " + "\n\n");
		}

		int[] array = new int[5];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[2] = 60;

	for (int ar = 0; ar < array.length; ar++ ) {
			System.out.println(ar + " - "+ array[ar] + " ");
		}

//		array = new int[7];
//		array[0] = 100;
//		array[1] = 200;
//		array[2] = 300;
//		array[3] = 400;
//		array[5] = 500;
//		array[4] = 400;
//		array[6] = 600;
//		
//		
//		System.out.print("\n =======================================" + "\n");
//
//		for (int ar = 0; ar < array.length; ar++ ) {
//			System.out.println(ar + " - "+ array[ar] + " ");
//		}

	}

}
