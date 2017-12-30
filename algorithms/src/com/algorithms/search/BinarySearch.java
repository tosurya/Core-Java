package com.algorithms.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int searchKey = 14;
		System.out.println("Key 14's position: " + search(arr, searchKey));
	}

	private static int search(int[] arr, int searchKey) {
		int startIndex = 0;
		int endIndex = arr.length - 1;
		// int midIndex = 0;
		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			if (searchKey == arr[midIndex]) {
				return midIndex;
			}
			if (searchKey < arr[midIndex]) {
				endIndex = midIndex - 1;
			} else {
				startIndex = midIndex + 1;
			}
		}
		return -1;
	}

}
