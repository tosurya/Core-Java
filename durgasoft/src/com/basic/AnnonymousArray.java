package com.basic;

public class AnnonymousArray {

	public static void main(String[] args) {
		int[] arr = new int[]{5,6}; // not annonymous array
		sum(new int[] { 1, 2, 3, 4 });
	}

	private static void sum(int[] is) {
		int total = 0;
		for (int i : is) {
			total = total + i;
		}
		System.out.println(total);
	}

}
