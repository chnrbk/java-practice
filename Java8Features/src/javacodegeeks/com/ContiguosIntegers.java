package javacodegeeks.com;
// Sorting based Java implementation 
// to check whether the array 
// contains a set of contiguous 
// integers 
import java.util.*; 

public class ContiguosIntegers { 
	
	// function to check whether 
	// the array contains a set 
	// of contiguous integers 
	static boolean areElementsContiguous(int arr[], 
											int n) 
	{ 
	// Sort the array 
	Arrays.sort(arr); 
	
	// After sorting, check if 
	// current element is either 
	// same as previous or is 
	// one more. 
	for (int i = 1; i < n; i++) 
		if (arr[i] - arr[i-1] > 1) 
			return false; 
	
	return true;	 
	} 
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{ 
		int arr[] = { 5, 2, 3, 6, 
					4, 4, 6, 6 }; 
		int n = arr.length; 
		
		if (areElementsContiguous(arr, n)) 
			System.out.println("Yes"); 
		
		else
			System.out.println("No"); 
		
	} 
	
} 
	
// This code is contributed by Arnav Kr. Mandal.	 
