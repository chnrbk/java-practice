
 package datastructures;

public class IntStackUsingArray {
	private int size;
	private int top;
	private int stack[];

	public IntStackUsingArray() {
		this.size = 50;
		this.top = -1;
		this.stack = new int[size];
	}

	public IntStackUsingArray(int size) {
		this.size = 50;
		this.top = -1;
		this.stack = new int[size];
	}
   
	public boolean push(int item) {
		if (isFull(stack)) {
			return false;

		} else {
			top = top + 1;
			stack[top] = item;
			return true;
		}

	}

	public int pop() {
		if (stack.length != 0) {
			return stack[top--];
		}
		return -1;
	}

	private boolean isFull(int[] stack) {
		if (top == stack.length - 1) {
			return true;
		}
		return false;
	}
}
