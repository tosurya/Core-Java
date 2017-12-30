package com.typecasting;

public class Casting {

	public static void main(String[] args) {
		Object o = new String("abc");
		Object o2 = new Object();
		System.out.println(o);// abc
		// StringBuffer buffer = (StringBuffer)o;//java.lang.ClassCastException:
		// java.lang.String cannot be cast to java.lang.StringBuffer
		// StringBuffer sb = (StringBuffer)o2;//java.lang.ClassCastException
		String str = (String) o;
		System.out.println(str);// abc
		// System.out.println(buffer);

		String str1 = new String("xyz");
		Object obj = (Object) str1;
		System.out.println(str1 == obj);//true
	}

}
