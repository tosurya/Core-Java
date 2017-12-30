package string;

import java.util.Scanner;

public class StringsSwap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String str1 = scanner.nextLine().trim();
		System.out.print("Enter second string : ");
		String str2 = scanner.nextLine().trim();
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After Swapping :");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		scanner.close();
	}

}

/*
 Output:
 Enter first string : java
Enter second string : j2ee
After Swapping :
str1 : j2ee
str2 : java
 */
