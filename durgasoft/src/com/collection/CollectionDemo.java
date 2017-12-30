package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		collection.add("a");
		collection.add("b");
		collection.add("a");
		Set set = new HashSet();
		set.add("a");
		set.add('b');
		set.add("y");
		set.add("z");
		collection.addAll(set);
		System.out.println(collection); // [a, b, a, b, a, z, y]
		collection.remove('b');
		System.out.println(collection);// [a, b, a, a, z, y]
		collection.remove("a");
		System.out.println(collection);// [b, a, a, z, y]
		collection.remove("a");
		System.out.println(collection);// [b, a, z, y]
		collection.remove("x");
		System.out.println(collection);// [b, a, z, y]
		System.out.println(collection.contains("b"));// true
		System.out.println(collection.containsAll(set));// false
		System.out.println(collection.size());// 4
		Object[] obj = collection.toArray();
		collection.removeAll(set);
		System.out.println(collection);// [b]
		Iterator<String> it = collection.iterator();
		collection.clear();
		System.out.println(collection);// []
		System.out.println(collection.isEmpty());// true

		Set<String> set2 = new HashSet<String>();
		set2.add("L");
		List<String> list = new ArrayList<String>();
		list.add("L");
		collection.add("L");
		System.out.println(collection.equals(list));// true
		System.out.println(collection.equals(set2));// false
		System.out.println(collection.hashCode());// 107
		System.out.println(list.hashCode());// 107
		System.out.println(set2.hashCode());// 76
		System.out.println(set.hashCode());// 438

		collection.add("M");
		list.add("K");
		collection.addAll(list);
		System.out.println(collection);// [L, M, L, K]
		collection.retainAll(list);
		System.out.println(collection);// [L, L, K]

		List<String> l1 = new ArrayList<String>();
		l1.add("AAA");
		l1.add("BBB");
		String[] str = l1.toArray(new String[544]);
		System.out.println(str[0]);// AAA
		System.out.println(str[1]);// BBB

	}

}
