
import java.util.Scanner;
import java.util.TreeSet;

class GreatestSmallerOnLeft {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCasesCount = sc.nextInt();
		for(int n = 0; n < testCasesCount; ++n){
		    int size = sc.nextInt();
		    int arr[] = new int[size];
		    for(int i = 0; i < size; ++i){
		        arr[i] = sc.nextInt();
		    }
		    go(arr);
		}
	}
	
	private static void go(int[] arr) {

        if(arr.length == 0) {
            return;
        }

        if(arr.length == 1) {
            System.out.println(-1);
            return;
        }

        TreeSet<Integer> mins = new TreeSet<>(); 
        System.out.print(-1);
        mins.add(arr[0]);
        for(int i = 1; i < arr.length; ++i) {

            Integer dd = mins.lower(arr[i]);
            mins.add(arr[i]);
            System.out.print(String.format(" %d", dd == null? -1 : dd));
        }
        System.out.println();
    }
}

/*
https://practice.geeksforgeeks.org/viewSol.php?subId=11352139&pid=4027&user=SerhiiHolovchuk
1
5
1 5 7 8 4
-1 1 5 7 1
*/