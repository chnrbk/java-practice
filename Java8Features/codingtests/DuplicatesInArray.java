import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class DuplicatesInArray {

	public static void main(String[] args) {
		
		int[] numArray = new int[]{5,2,3,4,4,5};
		int[] duplicateArray = new int[numArray.length];
		int k=0;
		for(int i=0;i<numArray.length;i++){
			for(int j=i+1;j<numArray.length;j++){
				if(numArray[i]==numArray[j]){
					duplicateArray[k]=numArray[i];
					k++;
				}
			}
		}
		
		System.out.println(IntStream.of(Arrays.copyOf(duplicateArray, k)).mapToObj(Integer::toString).collect(Collectors.joining(",")));

	}

}
