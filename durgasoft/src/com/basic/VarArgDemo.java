package com.basic;

public class VarArgDemo {
	// m1(int x, String... y) valid
	// m1(String... y, int x) invalid
	// m1(int... x, String... y) invalid
	//can declare both m1(int[]) and m1(int...)
	public static void sum(int... x) {
		int total = 0;
		for (int y : x) {
			total = total + y;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		sum(); // 0
		sum(1); // 1
		sum(1, 2); // 3
		sum(1, 2, 3); // 6
	}

}
