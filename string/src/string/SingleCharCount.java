package string;

public class SingleCharCount {

	public static void main(String[] args) {
		String s = "Java is java again java again";
		String c = "a";
		int count = s.length() - s.replace(c, "").length();
		System.out.println(count);
	}

}
