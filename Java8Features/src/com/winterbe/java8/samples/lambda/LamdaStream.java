package com.winterbe.java8.samples.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaStream {

	public static void main(String[] args) {

			
			List<Integer> myList = new ArrayList<>();
			for(int i=0; i<100; i++) myList.add(i);
			
			//sequential stream
			Stream<Integer> sequentialStream = myList.stream();
			
			//parallel stream
			Stream<Integer> parallelStream = myList.parallelStream();
			
			//using lambda with Stream API, filter example
			Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
			//using lambda in forEach
			highNums.forEach(p -> System.out.println("High Nums parallel="+p+1));
			
			Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
			highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
			
			System.out.println(sumIterator(myList));
			
			int sum = myList.stream().filter(n->n>10)
						   .mapToInt(n->n).sum();
			System.out.println(sum);
			
			int aSum = (int) myList.stream().filter(p->p>10).
					collect(Collectors.summingInt(p->p));
			System.out.println(aSum);			
			
		}


	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}

}
