package Basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		Boolean isPalindrome = isPalindrome(num);
		System.out.println("Is Palindrome : "+ isPalindrome);
		
	}
	
	
	public static Boolean isPalindrome(int num) {
		int original = num;
		int reversed = 0;

		while (num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		if (original == reversed) {
			return true;
		} else
			return false;
	}
}
