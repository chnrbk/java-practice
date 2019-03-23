package general;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// int[] a = new int[] { 2, 0, 1, 3, 8, 1, 9, 5, 4, 1 };
		int[] a1 = new int[] { 3, 5, 6, 6 };

		boolean hasDuplicates = hasDuplicates(a1);
		System.out.println("Array has duplicates?:" + hasDuplicates);
		int[] r1 = new int[]{3,5,6,6};
		System.out.println("Duplicates");
		
		Stream.of(findDuplicatesInArray(r1)).forEach(System.out::println);
		Stream.of(findDuplicatesInArray(r1)).flatMapToInt(a->Arrays.stream(a)).forEach(System.out::print);
	}

	private static int[] findDuplicatesInArray(int[] a) {
		int[] result = new int[a.length];
		
		int j=0,k=0;
		for (int i = 0; i < a.length; i++) {
			j++;
			if (j != a.length) {
				System.out.println(a[i] + "-" + a[j]);
				if (a[i] == a[j]) {
					System.out.println("true");
					result[k]=a[i];
					k++;
				}
			}
		}
		
		return result;
	}

	private static boolean hasDuplicates(int[] a) {
		Arrays.sort(a);
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			j++;
			if (j != a.length) {
				System.out.println(a[i] + "-" + a[j]);
				if (a[i] == a[j]) {
					System.out.println("true");
					return true;
				}
			}
		}
		return false;
	}
}