package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//convert list to array and array to List

public class ConvertListToArray {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("NAGESWARA", "RAO", "CH");

		// before java 8
		String[] arr = new String[list.size()];
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));

		// after java 8
		String array[] = list.stream().toArray(String[]::new);
		for (String a : array) {
			System.out.print(a + " ");
		}

		List l = convertArrayToList(array);

		int[] spam = new int[] { 1, 2, 3 };
		Arrays.stream(spam).boxed().collect(Collectors.toList());
	}

	private static List convertArrayToList(String[] array) {

		return Arrays.asList(array);
	
	}

}
