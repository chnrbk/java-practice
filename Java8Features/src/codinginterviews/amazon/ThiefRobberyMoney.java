package codinginterviews.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ThiefRobberyMoney {
	/*
	 * Given street of houses (a row of houses), each house having some amount
	 * of money kept inside; now there is a thief who is going to steal this
	 * money but he has a constraint/rule that he cannot steal/rob two adjacent
	 * houses. Find the maximum money he can rob. Input: The first line of input
	 * contains an integer T denoting the number of test cases. The first line
	 * of each test case is N and money. Output: Print maximum money he can rob.
	 * Constraints: 1 ≤ T ≤ 100 1 ≤ money ≤ 100 1 ≤ N ≤ 1000
	 * 
	 * Example: Input: 2 
	 * 5 10
	 * 2 12 Output:
	 *  30
	 *   12 Answer:
	 * 
	 */

	public static void main(String[] args) {
		
		Collections.<String>emptyList();
		List<Integer> l = new ArrayList<>()
;
		
		Set s = new HashSet<>();
		s.iterator();
				
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		for(int i=0;i<numberOfTestCases;i++){
			int numberOfHouses = sc.nextInt();
			int moneyPerHouse = sc.nextInt();
			
			if(numberOfHouses==0){
				System.out.println(0);
				System.exit(-1);
			}
			
			int totalMoneyRobbed = 0;
			if(numberOfHouses%2==0){
				totalMoneyRobbed = ((numberOfHouses)/2)*moneyPerHouse;
			}
			else{
				totalMoneyRobbed = ((numberOfHouses+1)/2)*moneyPerHouse;
			}
			System.out.println(totalMoneyRobbed);
		}
	}

}
