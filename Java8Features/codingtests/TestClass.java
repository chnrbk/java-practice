import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		System.out.println("1%2="+1%2);
		System.out.println("1/2="+1/2);

		//MAP
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "one");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry e = (Map.Entry) itr.next();
			e.getKey();
			e.getValue();
		}
		
		//SET
		Set s = new HashSet<>();
		
		//ArrayList
		
		List l = new ArrayList<>();
		String sss ="";
		System.out.println(String.join("-", sss));
		
		//convert  integers to comma separted string;
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		 String commaSeparatedNumbers = numbers.stream()
		     .map(i -> i.toString())
		     .collect(Collectors.joining(", "));
		 
		 //Int to string
			 String ss = String.valueOf(1);
			 
		
		// List to Map
			 List<String> list = Arrays.asList("b","a2","g33");
			Map<Integer, List<String>> lMap = list.stream().collect(Collectors.groupingBy(String::length));
			//lMap.entrySet().stream().forEach((x,y)->);
			
			//print hasMap using Java 8
				lMap.forEach((x,y)->System.out.println(x+""+y));
					lMap.forEach((k,v)->System.out.println("key: " + k + ", value: " + v));

			
		//Array of chars to List
			 int[] array= new int[10];
		List<Integer> lst = Arrays.stream(array).boxed().collect(Collectors.toList());
		
        int[] intArray = {1, 2, 3, 4, 5};

        // 1. Arrays.stream -> IntStream 
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(x -> System.out.println(x));

        // 2. Stream.of -> Stream<int[]>
        Stream<int[]> temp = Stream.of(intArray);

        // Cant print Stream<int[]> directly, convert / flat it to IntStream 
        IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));

        //sorry array list or array of strings
        
        String[] stringArray = {"d","b","e","n"};
        Stream.of(stringArray).map(String::toString).forEach(System.out::print);
        System.out.println(stringArray);
		Arrays.sort(stringArray);

        Arrays.sort(stringArray, String.CASE_INSENSITIVE_ORDER);
        Stream.of(stringArray).map(String::toString).forEach(System.out::print);
        
        //iterate over hasmap java 4 
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        Iterator it = hashMap.keySet().iterator();
        while(it.hasNext()){
        	System.out.println("\n"+it.next());
        }
        
        //iterate over hasmap java 5 
        Map<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(11, "oneone");
        hashMap1.put(22, "TwoTwo");
        hashMap1.forEach((a,b)->System.out.println(a+"-"+b));
        
	}

}
