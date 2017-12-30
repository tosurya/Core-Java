// Spilt string in substrings using String.split().
package string;
public class StringSplit {
	public static void main(String[] args) {
		String str = "www.includehelp.com";
		String[] subStrings = str.split("\\.");
		System.out.println(str + " sub strings are : ");
		for (String subString : subStrings) {
			System.out.println(subString);
		}
	}
}

/*
 www.includehelp.com sub strings are : 
www
includehelp
com

 */
