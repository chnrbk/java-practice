import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import nag.java8.features.Main;

import java.util.Set;

/**
 * * Java Program to find first duplicate, non-repeated character in a String. *
 * It demonstrate three simple example to do this programming problem. *
 * * @author Javarevisited
 */
public class NonRepeatingFirstCharacterInStringWithOneLoop {
	/*
	 * * Using LinkedHashMap to find first non repeated character of String *
	 * Algorithm : * Step 1: get character array and loop through it to build a
	 * * hash table with char and their count. * Step 2: loop through
	 * LinkedHashMap to find an entry with * value 1, that's your first
	 * non-repeated character, * as LinkedHashMap maintains insertion order.
	 */ public static char getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");
	}

	@Test
	public void test() {
		String str = "NageswaraCherukuruN";
		char n = NonRepeatingFirstCharacterInStringWithOneLoop.getFirstNonRepeatedChar(str);
		System.out.println(n);

	}

}

// Read more:https://
// javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz5eKcN7Cjf