package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add(null);
		set1.add(null);
		set1.add("A");
		set1.add("A");
		System.out.println(set1);// [null, A]
		List<String> list = new ArrayList<String>();
		list.add(null);
		list.add(null);
		list.add("A");
		list.add("B");
		list.add("B");
		Set<String> set2 = new HashSet<String>(list);
		System.out.println(set2);//[null, A, B]
		set2.add(null);
		set2.add("A");
		System.out.println(set2);//[null, A, B]
		set1.addAll(list);
		System.out.println(set1);////[null, A, B]
	}

}
