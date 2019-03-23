
public class NumberIsPowerOfTen {
	//Write a method that takes an integer and verifies if the number is power of 10.
	public static void main(String[] args) {
		boolean s =powerOfTen(10100000);
		System.out.println(s);
		boolean s1 =powerOfTenAlternative(100);
		System.out.println(s1);
	}

	private static boolean powerOfTen(int input) {
		while (input > 9 && input % 10 == 0) 
			  input /= 10;
			return input == 1;
	}
	
	private static boolean powerOfTenAlternative(int input) {
		if (input > 9 && input % 10 == 0) 
			
			return true;
		return false;
	}

}
