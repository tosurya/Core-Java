package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map map = new HashMap();
		List list = new ArrayList();
		list.add("XYZ");
		list.add("lmn");
		map.put("1", "A");
		map.put("2",list);
		System.out.println(map);//{2=[XYZ, lmn], 1=A}
		Map map2 = new HashMap();
		map2.putAll(map);
		System.out.println(map2);
	}
}
