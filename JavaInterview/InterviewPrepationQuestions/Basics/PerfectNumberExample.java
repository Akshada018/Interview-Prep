package Basics;

import java.util.Scanner;

public class PerfectNumberExample {
	
	// Perfect number -> Perfect numbers are positive integers that are equal to the sum of their proper divisors
//	(proper divisors = all divisors excluding the number itself).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int sum = 0;
		sc.close();
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		if(sum == num) {
			System.out.println("Given number is perfect "+ num);
		}else {
			System.out.println("Given number is not perfect "+ num);
		}
		
	}

}
