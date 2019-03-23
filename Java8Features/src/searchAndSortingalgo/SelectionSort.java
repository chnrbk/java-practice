package searchAndSortingalgo;

import java.util.Arrays;

public class SelectionSort {
	// 12,11,24,23,13,45
	public static void main(String[] args) {
		// int[] arr = new int[] { 12, 11, 24, 23, 13, 45 };
		int arr[] = { 64, 25, 12, 22, 11 };
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {

			// store first element
			int mid_index = i; // 11

			for (int j = i + 1; j < len; j++)
				if (arr[j] < arr[mid_index])
					mid_index = j;

			// Swap the found minimum element with the first
			int temp = arr[mid_index];
			arr[mid_index] = arr[i];
			arr[i] = temp;

		}
		System.out.println(Arrays.toString(arr));

	}
	// sort(arr);

	public static void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

	}
}