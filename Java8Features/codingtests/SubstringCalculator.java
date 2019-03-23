
public class SubstringCalculator {

	static int countNonEmptySubstr(String str) {
		int n = str.length();
		return n * (n + 1) / 2;
	}

	// Driver code
	public static void main(String args[]) {
		String s = "abcd"; //abc, ab, bc,a,b,c
		System.out.println(countNonEmptySubstr(s));
	}
}
