package com.algorithms.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int[] sortedArray = sort(arr);
		for (int element : sortedArray) {
			System.out.print(element + "\t");
		}
	}

	private static int[] sort(int[] arr) {
		int temp;
		for (int i = arr.length; i >= 0; i--) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

}
