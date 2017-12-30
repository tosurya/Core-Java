package com.basic;

public class VariablesDemo {
	int x = 10;
	static int y ;

	public static void main(String[] args) {
		VariablesDemo demo = new VariablesDemo();
		System.out.println(demo.x);
		demo.instance();
		System.out.println(y);
		System.out.println(VariablesDemo.y);
		System.out.println(demo.y);
	}

	private void instance() {
		System.out.println("instance variable in instance method :" + x);
		System.out.println("instance method :"+y);
	}

}
