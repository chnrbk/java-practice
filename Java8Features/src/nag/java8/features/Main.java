package nag.java8.features;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9)
        .peek(x->System.out.print("\nA"+x))
        .limit(3)
        .peek(x->System.out.print("B"+x))
        .forEach(x->System.out.print("C"+x));
        
      /*  
        Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
      //  .peek(e -> System.out.println("Filtered value: " + e))
        .map(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());*/

    }
}