package com.basic;

public class ArrayDemo {

	public static void main(String[] args) {
		int[][] a = new int[2][];
		a[0] = null;
		a[1] = new int[1];
		// a[2] = new int[2]; AIOBE
		System.out.println(a[1]);

		float[] f = { 1, 3.4f, 6L }; // double type is not accept
		System.out.println(f[2]);

		Number[] n = new Number[3];
		n[0] = new Integer(20);
		n[1] = 5;
		// n[2] = new Number(); CE --> abstract class type array, so sub types
		// allowed

		Runnable[] r = new Runnable[3];
		r[0] = new Thread();
		// r[1] = new String(); CE

		Object[] obj = new Object[3];
		obj[0] = new String();
		obj[1] = new Object();
		// obj[2] = new Number(); CE Number is abstract class
		obj[2] = new Thread();

		String[] str = new String[3];
		str[1] = new String("ABC");
		str[1] = new String("DEF");
		str[2] = new String("XYZ");
		Object[] obj2 = str;
		for (Object ob : obj2) {
			System.out.print(ob + "\t");
		}
		System.out.println("\n");
		char[] ch = { 88, (int) 87L, (int) 82.6F, (char) 89.2D, 'Z' };
		for (char c : ch) {
			System.out.print(c + "\t");
		}

	}

}
