package string.examples;

import java.util.Locale;

public class StringTest {
	/*
	 * compare(), concat(), equals(), split(), length(), replace(), compareTo(), join
	 * intern(), substring() etc.
	 */

	public static void main(String[] args) {
		char[] ch = new char[] { 'a', 'h', 'd', 'e' };
		String s = new String(ch);
		System.out.println(s);

		// compare
		String c1 = "Nag";
		String c2 = "Nag";
		if (c1 == c2) {
			System.out.println("c1=c2 is true");
		}
		/*
		 * if(c1.co(c2)){ System.out.println("c1=c2 is true"); }
		 */

		// concat

		String s1 = "Nag";
		String s2 = "Ch";
		String n = s1.concat(s2);
		System.out.println(n);

		// split -1
		String f1 = "Nag,Ch";
		System.out.println(f1.split(",",2));

		// split -1
		String f2 = "Nag,Ch";
		String[] ar = f2.split(",");
		
		for (String x : ar) {
			System.out.println(x);
		}
		
		//replace
		String r = "Lavanya Ch";
		String x = r.replace("Ch", "Dadhipineni");
		System.out.println(x);
		
		//substring
		String ss = "Nag is software engineer";
		String sss = ss.substring(0, 3); //nag
		System.out.println(sss);
		
		//index of 
		String i = "I am working in a company";
		
		System.out.println("index of a:"+i.indexOf('a'));
		System.out.println("Inded of am:"+i.indexOf("am"));
		
		//substring+index of 
		String si = "http://www.indexsubstring.com/url";
		
		//get url
		System.out.println("substring:"+si.substring(si.lastIndexOf("/")+1,si.length()));
		

		//equals 
		String e1 = "Naga";
		Object e2 = "Naga";
		System.out.println("e1.EQUALS OBJECT "+e1.equals(e2));
		
		//equals 
		Integer i1 = 1;
		Object i2 = 1;
		System.out.println("e1.EQUALS OBJECT1 "+i1.equals(i2));
				
		//starts with
		String sw = "Ch nageswara rao";
		
		System.out.println(sw.startsWith("Ch"));
		System.out.println(sw.startsWith(sw, 'C'));
		
		//upper case
		String u ="nag";
		System.out.println(u.toUpperCase(Locale.ENGLISH));

	}

}
