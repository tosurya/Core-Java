package com.constructor;

class A{
	int i;
	A(int a){
		super();
		System.out.println("A class constructor.");
	}
	
}
class B{
	B(int k){
		super();
		i=super.k;
		System.out.println("B class constructor.");
	}
}
public class ThisSuperDemo {

	public static void main(String[] args) {
		B b = new B(7);
	}

}
