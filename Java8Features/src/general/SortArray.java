package general;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[] a =  new int[]{3,4,2,1,0};
		
		sort(a);
		Arrays.stream(a).forEach(System.out::println);

	}

	//ascending
	private static void sort(int[] a) {
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]>a[j]){
					int t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
			
			
		}
		
	}

}
