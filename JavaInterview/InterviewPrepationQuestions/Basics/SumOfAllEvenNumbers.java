package Basics;

public class SumOfAllEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// to print sum of even numbers in 1 to 100
		for(int i=2; i<= 100; i += 2) {
//			if(i % 2 == 0) {
				sum += i;
//			}
		}
		System.out.println(sum);
		int sumOfOdd = 0;
		// to print sum of odd numbers from 1 to 100
		for(int i=1; i<= 100; i++) {
			if(i % 2 != 0) {
			sumOfOdd += i;
			}
		}
		System.out.println("Sum of odd numbers : "+ sumOfOdd);
	}

}
