

public class StringSimilarity {

	static int solve(String sample) {
		int len = sample.length();
		char[] letters = sample.toCharArray();
		int sim = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				System.out.format("\n" + i + "-" + j);
				if (letters[j - i] == letters[j])
					sim++;
				else
					break;
			}
		}
		return sim;
	}

	public static void main(String arg[]) {
		int s = solve("ababaa");
		System.out.println(s);
		// ababaa->ababaa, babaa,abaa,baa,ba,a ->//6+5+4+3+2+1
		//babaa -> babaa, abaa, baa, aa, a -> 5,2,2
		
	}
	
	/*
	 * For two strings A and B, we define the similarity of the strings to be the length of the longest prefix common to both strings. 
	 * For example, the similarity of strings "abc" and "abd" is 2, while the similarity of strings "aaa" and "aaab" is 3.
	 * Explanation:
	 * For the first case, the suffixes of the string are "ababaa", "babaa", "abaa", "baa", "aa" and "a". 
	 * The similarities of each of these strings with the string "ababaa" are 6,0,3,0,1,1 respectively. Thus the answer is 6 + 0 + 3 + 0 + 1 + 1 = 11
	 */
}
