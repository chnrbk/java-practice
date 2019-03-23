// Program to find n-th stair 
// using step size 1 or 2 or 3. 
import java.util.*; 
import java.lang.*; 

public class CountWaysToReachNthStair{ 
	
	// Returns count of ways to reach 
	// n-th stair using 1 or 2 or 3 steps. 
	public static int findStep(int n) 
	{ 
		if (n == 1 || n == 0) 
			return 1; 
		else if (n == 2) 
			return 2; 
	
		else
			return findStep(n - 3) + 
				findStep(n - 2) + 
				findStep(n - 1);	 
	} 
	
	// Driver function 
	public static void main(String argc[]){ 
		int n = 4; 
		System.out.println(findStep(n)); 
	} 
} 

/* This code is contributed by Sagar Shukla 

//1111--can take 1 step and 1 step
//31
121
22
13
211
112

How Code is Working :
Suppose you have n stairs then you can hop either 1 step, 2 step, 3 step.
1. If you hop 1 step then remaining stairs = n-1
2. If you hop 2 step then remaining stairs = n-2
3. If you hop 3 step then remaining stairs = n-3

If you hop 1 step then again you can hop 1 step, 2 step, 3 step until n equals 0.
Repeat this process and count total number of ways to reach at nth stair using step 1, 2, 3.
*/
