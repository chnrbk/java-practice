package javacodegeeks.com;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChartArrayToString {

	public static void main(String[] args) {
		
		//chars to List<Character>
		 Scanner sc = new Scanner(System.in);
		 String str  = sc.nextLine();
		 str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		 
		 //chars to List of String
		 str.chars().mapToObj(c->String.valueOf(c)).collect(Collectors.toList());
		 
		 int a = 51324; // Assuming 'a' is an int.
         String value = String.valueOf(a);
         char[] output = value.toCharArray();
         List<char[]> cList = Arrays.asList(output);
         
		 


	}

}
