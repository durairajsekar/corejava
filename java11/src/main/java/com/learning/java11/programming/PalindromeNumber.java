package com.learning.java11.programming;

public class PalindromeNumber {
	public static void main(String... args) {
		boolean isPalindrome = false;
		int n = 121;
		int x = n;
		int reversed = 0;
		while (x > 0) {
			int digit = x % 10;
			System.out.println("digit: " + digit);
			System.out.println("reversed before: " + reversed);
			reversed = reversed * 10 + digit;
			System.out.println("reversed after: " + reversed);
			x /= 10;
		}
		System.out.println(reversed);
	}

}
