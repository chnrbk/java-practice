

import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * Given a decimal number m. Convert it in binary string and apply n iterations,
 *  in each iteration 0 becomes 01 and 1 becomes 10. Find kth character in the string after nth iteration.

Input:
The first line consists of an integer T i.e number of test cases. 
The first and only line of each test case consists of three integers m,k,n. 

Output:
Print the required output.

Constraints: 
1<=T<=100
1<=m<=50
1<=n<=10
0<=k<|Length of final string|

Example:
Input:
2
5 5 3
11 6 4

Output:
1
1
https://practice.geeksforgeeks.org/problems/find-k-th-character-in-string/0
Given a decimal number m. Convert it in binary string and apply n iterations, 
in each iteration 0 becomes 01 and 1 becomes 10. Find kth character in the string after nth iteration.
 */
public class KthCharacerinBinaryStringAferNiterations {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while(t-- > 0){
		    int m = sc.nextInt(); //find m; Given a decimal number m, conver it to binary string
		    int k = 	sc.nextInt(); //find kth element
		    int n = sc.nextInt();
		    String s = Integer.toBinaryString(m);
		    System.out.println(s);
		    while(n-- > 0){
		    	System.out.println(s);
		        s = s.replaceAll("0","ab");
		        s = s.replaceAll("1", "ba");
		        s = s.replaceAll("a", "0");
		        s = s.replaceAll("b", "1");
		    }
		    System.out.println(s.charAt(k));
		    
		}
	}
}