package lottery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LotteryOddEvenPairs {

	public static void main(String[] args) {
		
		Set<Integer> cGameList = new HashSet<Integer>();
		Set<Integer> pSet1 = new HashSet<Integer>();
		Set<Integer> pSet2 = new HashSet<Integer>();
		cGameList.add(4);
		cGameList.add(9);
		cGameList.add(25);
		cGameList.add(29);
		cGameList.add(36);

		int maxNum1 = cGameList.stream().max((a,b)->a.compareTo(b)).orElse(0);
		System.out.println(maxNum1);
		
		for(int i=0;i<20;i++){
			int n = maxNum1+1;
			if(n>43){
				maxNum1=0;
			}
			pSet1.add(maxNum1+1);
			maxNum1++;
		}
		
		int maxNum2 = cGameList.stream().max((a,b)->a.compareTo(b)).orElse(0);
		
		for(int i=0;i<20;i++){
			System.out.println(maxNum2-1);
			
			pSet2.add(maxNum2-1);
			maxNum2--;
		}
		
		//System.out.println(pSet1);
		//System.out.println(pSet2);
		Set<Integer> evenNums = pSet1.stream().filter(n->n%2==0).collect(Collectors.toSet());
		evenNums.addAll(pSet2.stream().filter(n->n%2==0).collect(Collectors.toSet()));
		
		Set<Integer> oddNums = pSet1.stream().filter(n->n%2!=0).collect(Collectors.toSet());
		oddNums.addAll(pSet2.stream().filter(n->n%2!=0).collect(Collectors.toSet()));
		
		System.out.println(evenNums);
		System.out.println(oddNums);
		if (evenNums.size() < oddNums.size()) {
			System.out.println("Odd numbers are more than even numbers [odd: , Even:  ]"+evenNums.size() 
			+" <--even|odd->"+ oddNums.size());
			generate(evenNums,oddNums);
		} else {
			generate(evenNums,oddNums);
			System.out.println("Even numbers are more than odd numbers [odd: , Even:  ]"+evenNums.size()
			+" <--even|odd->"+ oddNums.size());		}
	}

	private static void generate(Set<Integer> evenNums, Set<Integer> oddNums) {
		ArrayList<Set<Integer>> pairs = new ArrayList<>();
	}
	/*1/11
	 * [32, 2, 34, 4, 38, 6, 40, 8, 42, 10, 12, 16, 18, 20, 22, 24, 26, 28, 30]
		[1, 33, 3, 35, 37, 5, 39, 7, 41, 9, 43, 11, 13, 17, 19, 21, 23, 25, 27, 29, 31]
	 */
	/*
	 * Expect
	 * 11, 
	 */

}
