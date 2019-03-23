package java8;

import java.util.Arrays;

public class AccumlatorExample {

	public static void main(String[] args) {

		String res = Arrays.asList("one", "two", "three", "four").stream().reduce("xx",
				(accumulatedStr, str) -> accumulatedStr + str); // accumulator

		System.out.println(res);

		// sum of integers
		int n = Arrays.asList(1, 3, 4).stream().mapToInt(a -> a).sum();
		System.out.println(n);

	}

}
