package nag.practice;

public class PassByValueDemo {
	
	public static void main(String[] args) {
		int i = 0;
		callMethod1(i);
		System.out.println("After call method :"+i);
	}

	private static void callMethod1(int i) {
		System.out.println(i);
		i=i+2;
		System.out.println(i);
	}

}
