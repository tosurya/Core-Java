package com.typecasting;

class A {
	static int x = 111;
	int y = 222;

	A(){
		System.out.println("A class constructor");
	}
	public static void m1() {
		System.out.println("static m1 in A");
	}

	public void m2() {
		System.out.println("m2 in A");
	}
}

class B extends A {
	static int x = 333;
	int y = 444;
	
	B(){
		System.out.println("B class constructor");
	}

	public static void m1() {
		System.out.println("static m1 in B");
	}

	public void m2() {
		System.out.println("m2 in B");
	}
}

class C extends B {
	static int x = 555;
	int y = 666;
	
	C(){
		System.out.println("C class constructor");
	}

	public static void m1() {
		System.out.println("static m1 in C");
	}

	public void m2() {
		System.out.println("m2 in C");
	}
}

public class Demo {

	public static void main(String[] args) {
		C c = new C();//A class constructor
					  //B class constructor
					  //C class constructor
		c.m1();// static m1 in C
		c.m2();// m2 in C
		System.out.println("Static variable is: " + c.x);//Static variable is: 555
		System.out.println("Instance variable is: " + c.y);//Instance variable is: 666
		((B) c).m1();// static m1 in B
		((B) c).m2();// m2 in C
		System.out.println("Static variable is: " + ((B) c).x);//Static variable is: 333
		System.out.println("Instance variable is: " + ((B) c).y);//Instance variable is: 444
		((A) c).m1();// static m1 in A
		((A) c).m2();// m2 in C
		System.out.println("Static variable is: " + ((A) c).x);//Static variable is: 111
		System.out.println("Instance variable is: " + ((A) c).y);//Instance variable is: 222
		B b = new C();//A class constructor
					  //B class constructor
					  //C class constructor
		b.m1();// static m1 in B
		b.m2();// m2 in C
		System.out.println("Static variable is: " + b.x);//Static variable is: 333
		System.out.println("Instance variable is: " + b.y);//Instance variable is: 444
		A a = new C();//A class constructor
					  //B class constructor
					  //C class constructor
		a.m1();// static m1 in A
		a.m2();// m2 in C
		System.out.println("Static variable is: " + a.x);//Static variable is: 111
		System.out.println("Instance variable is: " + a.y);//Instance variable is: 222
		
		System.out.println("Static variable is: " + ((A)((B)c)).x);//Static variable is: 111
		System.out.println("Instance variable is: " + ((A)((B)c)).y);//Instance variable is: 222
		
		A a2 = new B();//A class constructor
					   //B class constructor
	}

}
