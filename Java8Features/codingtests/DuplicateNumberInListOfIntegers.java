
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class DuplicateNumberInListOfIntegers {
 
    public int duplicatNumber(List<Integer> numbers){
    	
    	for(int i=0;i<numbers.size();i++){
    		
    		for(int j=i+1;j<numbers.size();j++){
    			if(numbers.get(i)==numbers.get(j)){
    				return numbers.get(i);
    			}
    		}
    	}
    	
    	return 1;
    }
    
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<4;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(4);
        List<Integer> intList = Arrays.asList(1,3,4,2,23,5,1,00);
        DuplicateNumberInListOfIntegers dn = new DuplicateNumberInListOfIntegers();
        System.out.println("Duplicate Number: "+dn.duplicatNumber(intList));

    }
}