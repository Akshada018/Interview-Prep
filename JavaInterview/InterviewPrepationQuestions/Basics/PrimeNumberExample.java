package Basics;

import java.util.Scanner;

public class PrimeNumberExample {

	// Prime number -> The number which are divisible by 1 or the number itself.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		if(isNumPrime(num)) {
			System.out.println("Given number is prime "+ num);
		}else {
			System.out.println("Given number is not prime "+ num);
			
		}
		sc.close();
	}
	
	public static boolean isNumPrime(int num) {
		if (num < 1)
			return false;
		if (num <= 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 5; i * i <= num; i+=6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;

		}
		return true;

	}

}
