package general;

public class ArrayOrder {

	public static void main(String[] args) {
		System.out.println("");

		int[] array = { 1, 3, 6, 5, 8 };

		//ascending order
		int temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("sorting with descending order");
		//descending order
				   for (int i = 1; i < array.length; i++) {
				    for (int j = i; j > 0; j--) {
				     if (array[j] > array [j - 1]) {
				      temp = array[j];
				      array[j] = array[j - 1];
				      array[j - 1] = temp;
				     }
				    }
				   }
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
	}
}
