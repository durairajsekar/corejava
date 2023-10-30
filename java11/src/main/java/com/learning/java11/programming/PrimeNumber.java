package com.learning.java11.programming;

public class PrimeNumber {
	public static void main(String... args) {
		int n = 31;
		var sqrt = Math.sqrt(n);
		boolean isPrime = true;
		for (int i = 2; i < sqrt; i++) {
			if (n % i == 0) {
				isPrime = false;
			}
		}
		System.out.println("Is Prime ? " + isPrime);
	}
}
