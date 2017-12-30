package com.algorithms.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 3, 8, 4, 2, 9 };
		int searchKey = 8;
		int index = search(arr, searchKey);
		System.out.println("Key " + searchKey + " found at index : " + index);
	}

	private static int search(int[] arr, int searchKey) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchKey) {
				return i;
			}
		}
		return -1;
	}

}
