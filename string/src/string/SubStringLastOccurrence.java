// search last occurrence of a substring inside a string.
package string;
public class SubStringLastOccurrence {
	public static void main(String[] args) {
		String str = "Hello world ,Hello Reader";
		String result = str.lastIndexOf("Hello") == -1 ? "Hello not found" : "Hello found";
		System.out.println(result);
	}
}

// Hello found