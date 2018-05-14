package nag.java8.features;

import java.*;

public class Annotations {

	public static void main(String[] args) {
		String pwd = null;
		testAnnotationNotNull(pwd);

	}

	private static void testAnnotationNotNull( String pwd) {
		System.out.println(pwd);
	}

}
