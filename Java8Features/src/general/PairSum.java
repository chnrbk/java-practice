package general;
/*package whatever //do not write package name here */

import java.util.*;

class PairSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCasesCount = sc.nextInt();

		for (int t = 0; t < testCasesCount; t++) {
			int sizeElements = sc.nextInt();
			int arr[] = new int[sizeElements];
			for (int i = 0; i < sizeElements; i++) {
				arr[i] = sc.nextInt();
			}
			int pairSum= sc.nextInt();
			findPair(arr,pairSum);
		}

	}

	private static void findPair(int[] arr, int pairSum ) {
	    boolean pairFoundFlag = false;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j])==pairSum){
				    System.out.println("("+arr[i]+","+arr[j]+")");
				    pairFoundFlag = true;
				}
			}
			
		}
		if(!pairFoundFlag){
		    System.out.println("-1");
		}
	}

		
}