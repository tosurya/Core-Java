package com.basic;

public class PrimitiveTypeDemo {

	public static void main(String[] args) {
		byte by = 10;
		byte by2 = 'B'; // 66
		//byte b = 130; CE
		//int i1 = 5.6; CE
		//int i2 = 7.5f; CE
		//int i3 = 8L; CE
		int i4 = by;
		int i5 = (int) 5.2;
		int i6 = (int) 9L;
		int i7 = (int) 4.6F;
		int i8 = 'Z'; // 90
		long a1 = 5;
		long a2 = 6L;
		long a3 = 9l;
		//long a4 = 7.9D; CE
		long a4 = (long) 7.9D;
		//long a5 = 4.5F; CE
		long a6 = (long) 3.2F;
		float f1 = 4.5f;
		float f2 = 8.7F;
		//float f3 = 7.9; CE
		float f4 = 9;
		float f5 = 0X10;
		float f6 = 010;
		float f7 = 8L;
		//float f8 = 4.6D;
		float f9 = (float) 4.6D;
		double d1 = 5.3d;
		double d2 = 6.4D;
		double d3 = 3.3f;
		double d4 = 7.8F;
		double d5 = 8.9;
		double d6 = 9;
		double d7 = 0X10;
		double d8 = 010;
		double d9 = 4L;
		
		boolean b1 = true;
		boolean b2 = false;
		//boolean b3 = True; CE
		
		char c1 = 'a';
		char c2 = 88; // X
		char c21 = (char) 89; // Y
		//char c3 = 9L; CE
		char c4 = (char) 93000088L; // ?
		//char c5 = 'ab'; CE
		//char c6 = "gh"; CE
		//char c7 = 5.6F; CE
		char c8 = (char) 88.5F;// X
		char c9 = (int) 89.78; // Y
		char c10 = 65535; // ?
		//char c11 = -10; CE
		char c12 = '\n';
		//char c13 = '\a'; CE
	}

}

//byte --> short --> int --> long --> float --> double
//         char --> int