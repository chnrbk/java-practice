package nag.java.data.structures;

import java.util.*;
import java.util.stream.IntStream;
import java.lang.*;
import java.io.*;

class ReverseString {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0){
		    String str = sc.next();
		    ArrayList<String> strarr = new ArrayList<String>(Arrays.asList(str.split("\\.")));
		    System.out.println(strarr);
		    Collections.reverse(strarr);
		    System.out.println(String.join(".",strarr));
		    n--;
		}
		
		String str =  "nagchn";
		IntStream reversed1 = str.chars();
				reversed1.forEach(System.out::println);
				
		String reversed = str.chars()
			    .mapToObj(c -> (char)c)
			    .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
		
	}
}