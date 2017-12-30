package corejava.stack;

public class Runner {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.show();
		System.out.println("ttt  " + stack.pop());
		stack.show();
		stack.push(30);
		stack.push(40);
		stack.show();
		System.out.println(stack.peek());
	}

}
