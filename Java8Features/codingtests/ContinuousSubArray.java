/*
 * Problem Statement: Given an unsorted array A of size N of non-negative integers, 
 * find a continuous sub-array which adds to the given number.
 */
public class ContinuousSubArray {

	public static void main(String[] args) {

		int[] a = new int[] { 5, 4, 5, 6, 7 };
		int num = 9;
		// return 11
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = a[i];
			for (int j = i + 1; j < a.length; j++) {
				sum += a[j];
				if (sum == num) {
					System.out.print("sub array:");
					for(int k=i;k<=j;k++){
						System.out.print(" "+a[k]);
					}
				}

			}

		}

	}

}
