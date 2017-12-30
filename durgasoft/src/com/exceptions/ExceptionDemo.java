package com.exceptions;

import java.io.IOException;

class A {
	A() {
		System.out.println("A class construction");
	}

	public void m1() throws Exception{
		System.out.println("m1 in A");
	}
}

class B extends A {
	B() throws IOException {// If parent class constructor throws some checked exceptin, child class constuctor should
		//throw same exception or its parent type exception
		System.out.println("B class construction");
	}

	public void m1() throws IOException {// If child class method throws some checked exceptin, parent class method should
		//throw same exception or its parent type exception
		System.out.println("m1 in B");
	}
}

class C extends B {
	C() throws Exception {
		System.out.println("C class construction");
	}

	public void m1() {
		System.out.println("m1 in C");
	}
}

public class ExceptionDemo {

	public static void main(String[] args) throws Exception{
		C c = new C();
		
	}

}
