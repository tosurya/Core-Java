package com.typecasting;

class Parent {
	public void show() {
		System.out.println("Show method in Parent class");
	}
}

class Child extends Parent {
	public void show() {
		System.out.println("Show method in Child class");
	}

	public void demo() {
		System.out.println("demo method");
	}
}

class SubChild extends Child {
	public void show() {
		System.out.println("Show method in SubChild class");
	}

	public void display() {
		System.out.println("display method in SubChild class");
	}
}

class Test extends Parent {
	public void show() {
		System.out.println("Show method in Test class");
	}
}



public class TypeCastDemo {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.show(); // Show method in Parent class

		Parent p2 = new Child();
		p2.show();// Show method in Child class
		// p2.demo(); CE

		Parent p3 = (Child) new SubChild();
		p3.show();// Show method in SubChild class
		// p3.demo(); CE
		// p3.diplay(); CE
		
		//Parent p4 = (Test) new SubChild(); CE
		
		Test t1 = new Test();
		t1.show(); // Show method in Test class
		Child c1 = new Child();
		c1.show();//Show method in Child class
		
	}

}
