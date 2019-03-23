package nag.practice;

import java.util.Arrays;
import java.util.stream.*;

public class TestArray {

	public static void main(String[] args) {
		String[][] names = { {"Sam", "Smith"},
                {"Robert", "Delgro"},
                {"James", "Gosling"},
              };
		
		String[][] nlist = { {"Sam", "Smith"}
               
              };
		
		System.out.println(names);
		
		Stream.of(names).flatMap(Stream::of)
						.forEach(System.out::println);
		
		Arrays.stream(names)
	    .map(a -> String.join(" ", a))
	        .forEach(System.out::println);
		
		System.out.println(String.join(" ", nlist[0]));
		System.out.println(nlist[0].toString());

		
	}

}
