package threads;
public class Memory {

	//https://cdn.journaldev.com/wp-content/uploads/2014/08/Java-Heap-Stack-Memory.png
	public static void main(String[] args) { // Line 1--method area [part of PermGen]
		int i=1; // Line 2
		Object obj = new Object(); // Line 3
		Memory mem = new Memory(); // Line 4
		mem.foo(obj); // Line 5
	} // Line 9

	private void foo(Object param) { // Line 6
		String str = param.toString(); //// Line 7
		System.out.println(str);
	} // Line 8

}