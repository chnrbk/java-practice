package javacodegeeks.com;import java.util.Arrays;

public class BinarySearch {
    public static boolean contains(int[] a, int b) {
        if (a.length == 0) {
            return false;
        }
        int low = 0;
        int high = a.length-1;

        while(low <= high ) {
            int middle = (low+high) /2;

            System.out.println("middle"+middle);
            if (b> a[middle] ){
                low = middle +1;
            } else if (b< a[middle]){
                high = middle -1;
            } else { // The element has been found
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
		System.out.println(contains( new int[]{2,3,4,5,6,7,8,9}, 10));
	}
}