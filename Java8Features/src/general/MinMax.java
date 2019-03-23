package general;

import java.util.TreeSet;

public class MinMax {

	public static void main(String[] args) {
		
		System.out.println("Integer min:"+Integer.MAX_VALUE);
		
		System.out.println("Integer min:"+Integer.MIN_VALUE);
		
		TreeSet<Integer> mins = new TreeSet<Integer>();
		mins.add(2);
		mins.add(5);
		mins.add(7);
		mins.add(4);
		
		System.out.println(" Lower .."+mins.lower(7));
	}

}
