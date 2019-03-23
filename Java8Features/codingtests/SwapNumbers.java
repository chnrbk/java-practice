
public class SwapNumbers {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 5;
		//store big number in variable
		n2 = n1+n2; //8
		n1 = n2 -n1; //2
		n2 = n2-n1; //8-2;
		
		n1 = n1 + n2; //8
		n2 = n1 - n2; //8-5
		n1 = n1 - n2;//
			System.out.println(""+String.join("-", String.valueOf(n1),String.valueOf(n2)));
	}

}
