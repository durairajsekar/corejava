package com.learning.java11.arrays.sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] input = new int[] {9,6,3,5,4,7,10,22};
		PrintArray.input(input);
		int[] output = merge_sort_alg(input);
		PrintArray.output(output);
	}

	private static int[] merge_sort_alg(int[] input) {
		// base case
		if(input.length<=1) {
			return input;
		}
		// divide the input array
		int midIdx = input.length/2;
		int[] left = Arrays.copyOfRange(input, 0, midIdx);
		int[] right = Arrays.copyOfRange(input, midIdx, input.length);
		
		// recursively call merge_sort_alg
		left = merge_sort_alg(left);
		right = merge_sort_alg(right);
		
		// merge the arrays		
		return merge_asc(left,right);
	}

	private static int[] merge_desc(int[] left, int[] right) {
		int[] result = new int[left.length+right.length];
		int idx = 0;
		int leftIdx = 0;
		int rightIdx = 0;
		while(leftIdx<left.length && rightIdx<right.length) {
			if(left[leftIdx] > right[rightIdx]) {
				result[idx] = left[leftIdx];
				leftIdx++;
			}else {
				result[idx] = right[rightIdx];
				rightIdx++;
			}
			idx++;
		}
		while(leftIdx<left.length) {
			result[idx] = left[leftIdx];
			idx++;
			leftIdx++;
		}
		while(rightIdx<right.length) {
			result[idx] = right[rightIdx];
			idx++;
			rightIdx++;
		}
		return result;
	}
	
	private static int[] merge_asc(int[] left, int[] right) {
		int[] result = new int[left.length+right.length];
		int idx = 0;
		int leftIdx = 0;
		int rightIdx = 0;
		while(leftIdx<left.length && rightIdx<right.length) {
			if(left[leftIdx] < right[rightIdx]) {
				result[idx] = left[leftIdx];
				leftIdx++;
			}else {
				result[idx] = right[rightIdx];
				rightIdx++;
			}
			idx++;
		}
		while(leftIdx<left.length) {
			result[idx] = left[leftIdx];
			idx++;
			leftIdx++;
		}
		while(rightIdx<right.length) {
			result[idx] = right[rightIdx];
			idx++;
			rightIdx++;
		}
		return result;
	}
}
