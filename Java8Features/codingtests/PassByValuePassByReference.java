/*
 * since java is pass by value you can't swap without function so use another class with variables a,b as members and swap them
 */
public class PassByValuePassByReference {

	public static void main(String[] args) {

		int u = 3, v = 4;
		System.out.printf("Before swap:%d - %d", u, v);
		swap(u, v);
		System.out.printf("\nAfter swap:%d - %d", u, v);

	}

	private static void swap(int u, int v) {

		int temp = u;
		u = v;
		v = temp;
	}

}
