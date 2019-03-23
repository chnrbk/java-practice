import java.util.stream.*;

/*
 * Write a Java program that prints the numbers from 1 to 50. But for multiples of three print 
 * "Fizz" instead of the number and for the multiples of five print "Buzz".
 *  For numbers which are multiples of both three and five print "FizzBuzz"


Read more: http://www.java67.com/2012/08/10-java-coding-interview-questions-and.html#ixzz5iuaoALqw
 */
public class Fizz {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 50).forEach(x -> System.out.println(print(x)));

	/*	for (int i = 1; i <= 50; i++) {
			if (i % (3 * 5) == 0)
				System.out.println("FizzBuzz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}*/
	}

	private static String print(int x) {
		if (x % (3 * 5) == 0) {
			return "FizzBuzz";
		}
		else
		if (x % 3 == 0) {
			return "Fizz";
		} else if (x % 5 == 0) {
			return "Buzz";
		} else 
		return String.valueOf(x);
	}

}
