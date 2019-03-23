import java.util.Arrays;
import java.util.stream.Stream;

public class StringReverse {
	public static void main(String[] args) {
		String s = "Nag Cherukuru";
		String[] sArray = s.split("\\s");
		int len = sArray.length;
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(" " + sArray[i]);
		}

		System.out.print("-----------------");
		String s1 = "Cherukuru";
		char[] s1CharArray = s1.toCharArray();
		int n = s1CharArray.length;
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(s1CharArray[i]);
		}

		System.out.print("-----------------");
		String s2 = "Cherukuru";
		char[] s2CharArray = s1.toCharArray();
		int n2 = s2CharArray.length;
		char[] rArray = new char[n2];
		int k = 0;
		for (int i = n2 - 1; i >= 0; i--) {
			rArray[k] = s2CharArray[i];
			k++;
		}
		
		System.out.println("S2 to string"+Arrays.toString(rArray));
		
		System.out.print("-----------------\n");

		Stream.of(rArray).forEach(a->System.out.println(a));
	}
}
