package com.algorithms.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 1, 3, 9, 6 };
		int[] sortedArray = sort(arr);
		for (int element : sortedArray) {
			System.out.print(element + "\t");
		}
	}

	private static int[] sort(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

				}
			}
		}
		return arr;
	}
}
