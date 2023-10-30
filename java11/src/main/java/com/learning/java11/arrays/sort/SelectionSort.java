package com.learning.java11.arrays.sort;

public class SelectionSort {
	public static void main(String... args) {
		int[] input = new int[] {9,6,3,5,4,7,10,22};
		PrintArray.input(input);
		int[] ouput = selection_sort_desc(input);
		PrintArray.output(ouput);
	}

	private static int[] selection_sort_asc(int[] input) {
		for(int i=0; i<input.length; i++) {
			int minIdx = i;
			for(int j=i+1; j<input.length; j++) {
				if(input[j]<input[minIdx]) {
					minIdx = j;
				}
			}
			if(minIdx!=i) {
				int temp = input[i];
				input[i] = input[minIdx];
				input[minIdx] = temp;
			}
			
		}
		return input;
	}
	private static int[] selection_sort_desc(int[] input) {
		for(int i=0; i<input.length; i++) {
			int maxIdx = i;
			for(int j=i+1; j<input.length; j++) {
				if(input[j]>input[maxIdx]) {
					maxIdx = j;
				}
			}
			if(maxIdx!=i) {
				int temp = input[i];
				input[i] = input[maxIdx];
				input[maxIdx] = temp;
			}
			
		}
		return input;
	}
}
