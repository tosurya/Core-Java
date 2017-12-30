package com.constructor;

class Test{
	Test(double d){
		this(10);
		System.out.println("double args");
	}
	
	Test(int i){
		this();
		System.out.println("int args");
	}
	
	Test(){
		System.out.println("No args");
	}
} 

public class CODemo {

	public static void main(String[] args) {
		Test t1 = new Test(10.5);
		/*No args
		int args
		double args
		*/
	}

}
