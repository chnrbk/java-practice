package javacodegeeks.com;

import java.util.Arrays;
import java.util.stream.*;;
public class LamdaTest {

	public static void main(String[] args) {

		Arrays.asList("d","c","a","b").forEach(a->System.out.println(a));
		
		
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		Runnable r=()->{System.out.println("");};
		Thread t = new Thread(()->{
									System.out.println("");
							});
		
		FuncInterface d = (int x)->{System.out.println(x);};
		
		d.abstractMethod(3);
		
		
	}
	

}
