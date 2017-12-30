package corejava.stack;

public class Stack {
	int[] arr = new int[5];
	int top = 0;

	public void push(int data) {
		arr[top] = data;
		top++;
	}

	public void show() {
		for (int element : arr) {
			System.out.print(element + "\t");
		}
		System.out.println();
	}

	public int pop() {
		top--;
		int data = arr[top];
		arr[top] = 0;
		return data;
	}
	public int peek() {
		return arr[top-1];
	}


}
