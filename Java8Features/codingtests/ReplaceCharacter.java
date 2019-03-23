import java.util.Arrays;

public class ReplaceCharacter {

	public static void main(String[] args) {
		
		String s="Nageshwara";
		System.out.println("after replace: "+replace(s,'h', ' '));
		
	}
	public static String replace(String s , char str, char ch){
		
		if(s == null)return
				"";
		int l = s.length();
		char[] narr = new char[l];
		char[] arr = s.toCharArray();
		for(int i=0;i<l;i++){
			if(arr[i]==str){
				narr[i]=ch;
			}else{
			narr[i]=arr[i];	
			}
		}
		
		return Arrays.toString(narr);
		
		
		
	}
}
