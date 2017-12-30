package com.basic;

public class VariableDemo2 {
	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		VariableDemo2 demo = new VariableDemo2();
		demo.x = 30;
		demo.y = 40;
		VariableDemo2 demo2 = new VariableDemo2();
		System.out.println(demo2.x + " " + demo2.y);
	}

}
