package com.learning.java11.arrays.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] input = new int[] { 9, 5, 3, 6, 1, 8, 7 };
		PrintArray.input(input);
		var output = sort_desc_bubble_sort(input);
		PrintArray.output(output);
	}

	private static int[] sort_desc_bubble_sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length - 1; j++) {
				if (input[j] < input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;
	}

	private static int[] sort_asc_bubble_sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;
	}

}
