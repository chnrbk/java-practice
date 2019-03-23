import java.lang.annotation.*;

public class FibonacciNumbers {
	
	public static void main(String[] args) {
		int count = 15;
		int[] fibonacci = new int[count];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int x = 2; x < count; x++) {
			fibonacci[x] = fibonacci[x - 1] + fibonacci[x - 2];
		}

		for (int x1 = 0; x1 < count; x1++) {
			System.out.print(fibonacci[x1] + " ");
		}
	}
}