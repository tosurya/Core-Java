package string;

import java.util.Scanner;

public class PreservingPositionStringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scanner.nextLine();
		char[] ch1 = str.toCharArray();
		char[] ch2 = new char[ch1.length];
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == ' ') {
				ch2[i] = ' ';
			}
		}
		int j = ch1.length - 1;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ' ') {
				if (ch2[j] == ' ') {
					j--;
				}
				ch2[j] = ch1[i];
				j--;
			}
		}
		System.out.println(str + " -->" + String.valueOf(ch2));

		scanner.close();
	}
}
