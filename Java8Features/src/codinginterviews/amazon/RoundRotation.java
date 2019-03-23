package codinginterviews.amazon;

public class RoundRotation {
	
	/*
		 * 1) Given two words, find if second word is the round rotation of first word.
		For example: abc, cab
		return 1
		since cab is round rotation of abc
		Example2: ab, aa
		return -1
		since aa is not round rotation for aa 
	 * 
	 */

	public static void main(String[] args) {

		String s = "abcdefgh";
		int len = s.length();
		char[] chars = new char[len];
		chars[0] = s.charAt(len - 1); // c
		for (int i = 0; i < len - 1; i++) {
			chars[i + 1] = s.charAt(i); // itr -1 a(i=0) ,b(i=1)
		}
		String n = chars.toString();
		System.out.println("Rounded string:" + String.valueOf(chars));
		// System.out.println("Rounded string:" + n.valueOf(n).toString());

	}

}
