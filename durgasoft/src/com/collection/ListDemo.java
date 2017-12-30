package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add(0, "A");
		list1.add(0, "B");
		list1.add(0, "A");// [A, B, A]
		System.out.println(list1);
		System.out.println(list1.indexOf("A"));// 0
		System.out.println(list1.lastIndexOf("A"));// 2
		List<String> list2 = new LinkedList<String>(list1);
		// list2.add(12,"X"); java.lang.IndexOutOfBoundsException:
		list2.add(2, "X");
		list2.add(2, "Y");
		System.out.println(list2);// [A, B, Y, X, A]
		System.out.println(list2.get(1));// B
		List<String> list3 = new ArrayList<String>();
		list3.add(0, "Z");
		list3.addAll(0, list2);
		System.out.println(list3);// [A, B, Y, X, A, Z]
		Iterator<String> it1 = list3.listIterator();
		list3.remove(2);
		System.out.println(list3);//[A, B, X, A, Z]
		list3.set(3, "K");
		System.out.println(list3);//[A, B, X, K, Z]
		System.out.println(list3.subList(2, 4));//[X, K]
		Iterator<String> it2 = list3.listIterator(3);
		//list3.remove(2); java.util.ConcurrentModificationException
		while (it2.hasNext()) {
			System.out.print(it2.next() + "\t");// K	Z
		}
		System.out.println();
		List<String> list4 = list3.subList(2, 4);
		System.out.println(list4);//[X, K]
		list4.add(1,"V");
		System.out.println(list4);//[X, V, K]
	}

}
