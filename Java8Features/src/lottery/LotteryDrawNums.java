package lottery;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LotteryDrawNums {

	public static void main(String[] args) {
	/*	ArrayList<Integer> digitNumbers1 = new ArrayList<>();
		ArrayList<Integer> digitNumbers2 = new ArrayList<>();
		ArrayList<Integer> digitNumbers3 = new ArrayList<>();
		ArrayList<Integer> digitNumbers4 = new ArrayList<>();
		ArrayList<Integer> digitNumbers5 = new ArrayList<>();
		*/
		int [] digitNumbers1 = new int[11];
		int [] digitNumbers2 = new int[11];
		int [] digitNumbers3 = new int[11];
		int [] digitNumbers4 = new int[11];
		int [] digitNumbers5 = new int[11];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of numbers in the game\n");
		
		int gameNumbersCount = sc.nextInt();
		int [] nCurrNums = new int[gameNumbersCount];

		System.out.println("Enter numbers of the current game \n");
		for(int i=0;i<gameNumbersCount;i++){
			nCurrNums[i] =sc.nextInt();
		}
		System.out.println("current game numbers" + nCurrNums);
		
		int ai = 1;
		Set<String> numberLineSet = new TreeSet<String>();
		Set<Integer> uniqueNumsSet = new TreeSet<Integer>();

		for(int i=1;i<=15;i++){
			int itr = i;
			String numberLine1 = String.valueOf(nCurrNums[0]+itr)+" "+String.valueOf( nCurrNums[1]+itr)+" "+
								String.valueOf(nCurrNums[2]+itr)+" "+String.valueOf( nCurrNums[3]+itr)+" "+
								String.valueOf( nCurrNums[4]+itr);
			
			
			numberLineSet.add(numberLine1);
			String numberLine2 = String.valueOf(nCurrNums[0]-itr)+" "+String.valueOf( nCurrNums[1]-itr)+" "+
					String.valueOf(nCurrNums[2]-itr)+" "+String.valueOf( nCurrNums[3]-itr)+" "+
					String.valueOf( nCurrNums[4]-itr);
			numberLineSet.add(numberLine2);
			
			uniqueNumsSet.add(nCurrNums[0]+itr);			
			uniqueNumsSet.add(nCurrNums[1]+itr);			
			uniqueNumsSet.add(nCurrNums[2]+itr);			
			uniqueNumsSet.add(nCurrNums[3]+itr);			
			uniqueNumsSet.add(nCurrNums[4]+itr);
			sendForPermute(uniqueNumsSet);
			uniqueNumsSet.clear();
			System.out.println("after clean:"+uniqueNumsSet.size());
			uniqueNumsSet.add(nCurrNums[0]-itr);
			uniqueNumsSet.add(nCurrNums[1]-itr);
			uniqueNumsSet.add(nCurrNums[2]-itr);
			uniqueNumsSet.add(nCurrNums[3]-itr);
			uniqueNumsSet.add(nCurrNums[4]-itr);
			
			/*digitNumbers1.add(numbersCurrentGame[0]+i);
			digitNumbers1.add(numbersCurrentGame[0]-i);
			digitNumbers2.add(numbersCurrentGame[1]+i);
			digitNumbers2.add(numbersCurrentGame[1]-i);
			digitNumbers3.add(numbersCurrentGame[2]+i);
			digitNumbers3.add(numbersCurrentGame[2]-i);
			digitNumbers4.add(numbersCurrentGame[3]+i);
			digitNumbers4.add(numbersCurrentGame[3]-i);
			digitNumbers5.add(numbersCurrentGame[4]+i);
			digitNumbers5.add(numbersCurrentGame[4]-i);*/
		}
		
		//numberLineSet.forEach(e->System.out.println(e));
		
		sendForPermute(uniqueNumsSet);
	}

	private static void sendForPermute(Set<Integer> uniqueNumsSet) {
		int[] array = uniqueNumsSet.stream()
					.filter(n->n>=0)
					.filter(n->n<=43)
				.mapToInt(Number::intValue).toArray();

		System.out.println("array of unquie elements to permute:"+array.length);
		
		int n= array.length;
		
		
		permute(array,0);
	}
	
	static void permute(int[] a, int k) 
    {
        if (k == a.length) 
        {
            for (int i = 0; i < a.length; i++) 
            {
                System.out.print("" + a[i] + " ");
            }
            System.out.println();
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }

}