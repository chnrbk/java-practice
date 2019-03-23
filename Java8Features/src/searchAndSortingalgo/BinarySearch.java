package searchAndSortingalgo;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 6, 9, 12, 14, 19 };
		int b = 12;
		contains(a, b);
	}

	public static boolean contains(int[] a, int b) {

		if (a.length == 0) {
			return false;
		}

		int low = 0;
		int high = a.length - 1; // 6

		while (low <= high) { // itr1- 0<=6 ; low =4=> 4+6/2 =5 ;5<6 //itr
								// 3->4<=4[found]
			int middle = (low + high) / 2; // =3;itr2->5//itr 3-> middle=4+4/2
											// =4
			System.out.println("middle" + middle);
			if (b > a[middle]) { // 12>9 (middle), itr2-12>14
				low = middle + 1; // low =4 , value 12
			} else if (b < a[middle]) { // 12<14 a[5]
				high = middle - 1; // high=5-1; =>high =4
			} else if (b == a[middle]) {
				System.out.format("found number%d at position%d", b, middle);
				return true;
			}
		}
		return false;
	}
}
