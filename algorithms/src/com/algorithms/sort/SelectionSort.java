package com.algorithms.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 7, 8, 5, 4, 9, 2 };
		int[] sortedArray = sort(arr);
		for (int element : sortedArray) {
			System.out.print(element + "\t");
		}

	}

	private static int[] sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			int minVal = arr[i];
			int minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (minVal > arr[j]) {
					minVal = arr[j];
					minIndex = j;
				}
			}
			if (minVal < arr[i]) {
				temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}

}
