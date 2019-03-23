package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CMETest {

	private static List<String> lis = new ArrayList<>();
	

	public static void main(String[] args) {
		 List<Integer> integers = newArrayList(1, 2, 3);
		 
		    for (Integer integer : integers) {
		    	System.out.println(integer);
		    //	integers.add(7);
		        //integers.remove(1);
		    }
		    
		    Map< String, List< String >> messages = getSomeMessage();
		    
		    messages.entrySet().stream().forEach(entry -> {
			entry.getValue().stream().forEach(li -> {
				if (lis.indexOf(li) == -1) {
					lis.add(li);
				}
			});
		});
		    
		    ArrayList list;
			//findNumbers(list, (i1, i2) -> Numbers.isMoreThanFifty(i1, i2));

		    
		    int min1 = Arrays.stream(new int[]{1, 2, 3, 4, 5})
		    		  .min()
		    		  .orElse(0);
		
		   System.out.println("Distinct values:"+ messages.values().stream()
		    				 .flatMap(List::stream)
		    				 .distinct()
		    				 .collect(Collectors.toList()));
		    
	}

	private static Map<String, List<String>> getSomeMessage() {
		ArrayList<String> aList = new ArrayList<>();
		aList.add("oneX");
		aList.add("oneY");
		aList.add("oneZ");
		HashMap<String, List<String>> hashMap = new HashMap<>();
		hashMap.put("one", aList);
		return hashMap;
	}

	private static List<Integer> newArrayList(int i, int j, int k) {
		ArrayList<Integer> intList	=	new ArrayList<>();
		intList.add(1);
		intList.add(3);
		intList.add(5);
		
		Arrays.asList(1);
		return intList;
	}

}
