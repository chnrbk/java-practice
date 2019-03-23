import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 *  how do you find all pairs of an integer array whose sum is equal to a given number? 
 */
public class SumOfTwoInAnArray {

	public static void main(String[] args) {
		int[] a = getRandomArray(10);
		System.out.println("Randome 10 numbers below 15::"+Arrays.toString(a));
		printPairsUsingSet(a,6);

	}

	/**
	 * * Given an array of integers finds two elements in the array whose sum is
	 * equal to n. * @param numbers * @param n
	 */
	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set set = new HashSet(numbers.length);
		for (int value : numbers) {
			int target = n - value;
			// if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}
	
	
	
	/** * Utility method to return random array of Integers in a range of 0 to 15 */ 
	public static int[] getRandomArray(int length) {
		int[] randoms = new int[length];
		for (int i = 0; i < length; i++) {
			randoms[i] = (int) (Math.random() * 15);
		}
		return randoms;
	}

	//Read more: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz5gSokyg4q

}
