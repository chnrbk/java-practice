package nag.java8.features;

import java.util.Comparator;

public class LamdaExpressions {

	public static void main(String[] args) {
		Comparator<String> byName =
				(String o1, String o2)->o1.toString().compareTo(o2.toString());

	}

}
