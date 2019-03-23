package nag.java.data.structures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortElements {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(4, 2, 3, 5, 7, 9);
		Collections.sort(l);

		Comparator d = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 == o2)
					return 0;
				if (o1 > o2)
					return 1;
				else
					return -1;
			}

		};
		Collections.sort(l, d);
		System.out.println(l);

	}

}
