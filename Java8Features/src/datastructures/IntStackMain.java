package datastructures;
import java.util.stream.*;
public class IntStackMain {

	public static void main(String[] args) {

		IntStackUsingArray intStack = new IntStackUsingArray();
		IntStream.rangeClosed(1, 50)
				.boxed()
				.forEach(i->intStack.push(i));
			
		IntStream.rangeClosed(1, 50)
		.boxed()
		.forEach(p->System.out.format("%d ",intStack.pop()));

	}

}
