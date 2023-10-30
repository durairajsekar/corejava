package com.learning.java11.programming;

public class Fibonacci{
	
	
	public static void main(String... args) {
		int n=10;
		int count=0;
		int prevNum=0;
		int currentNum=1;
		int next=0;
		do {
			System.out.println(prevNum);
			next=prevNum+currentNum;
			prevNum=currentNum;
			currentNum=next;
			count++;
		}while(count<n);
	}

}
