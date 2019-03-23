
public class MinMaxMyOwnArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 8, 5, 6 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min + "-" + max);
	}

}
