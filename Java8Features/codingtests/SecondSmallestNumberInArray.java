import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestNumberInArray {

	// Find the second smallest element in an array.

	public static void main(String[] args) {
		// Find the second smallest element in an array.
		int[] array = new int[] {12, 13, 3, 10, 34, 1};

		List<Integer> list = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
		int _2ndSmallestNumber = list.get(1);
		System.out.println(_2ndSmallestNumber);
		
		print2ndSmallest(array);

	}
	// efficient way
	// https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/

	private static void print2ndSmallest(int[] arr) {
		int first, second;
		if (arr == null || arr.length < 2) {
			System.out.println("Int array is empty");
			return;
		}
		first = second = Integer.MAX_VALUE;

		// 2,4,1 ;first =2 ,second =max,//iteration 2, 4>2
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < first) {
				second = first;
				first = arr[i];				
			} else if (arr[i] < second && arr[i]!=first)
				second = arr[i];
		}
		System.out.println("2nd smallest:"+second);

	}

}
