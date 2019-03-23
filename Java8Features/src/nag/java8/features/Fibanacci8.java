package nag.java8.features;

import java.util.stream.Stream;

public class Fibanacci8 {

	public static void main(String[] args) {
		int[] fibs = { 0, 1 };
		Stream<Integer> fibonacci = Stream.generate(() -> {
			int result = fibs[1];
			int fib3 = fibs[0] + fibs[1];
			fibs[0] = fibs[1];
			fibs[1] = fib3;
			return result;
		}).limit(1000);
		
		fibonacci.forEach(System.out::println);
	}

}

