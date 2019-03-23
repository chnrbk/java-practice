package searchAndSortingalgo;

import java.util.Arrays;

public class BubbleSort {
	// https://www.geeksforgeeks.org/bubble-sort/
	// Bubble Sort is the simplest sorting algorithm that works by repeatedly
	// swapping the adjacent elements if they are in wrong order.
	public static void main(String[] args) {

		int[] arr = { 2, 4, 1, 2, 5, 6, 4 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
