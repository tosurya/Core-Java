//search a word inside a string.
package string;

public class WordFinder {
	public static void main(String[] args) {
		String str = "Hello readers";
		if (str.indexOf("Hello") == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Hello found");
		}
	}

}
