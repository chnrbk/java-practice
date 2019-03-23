package javacodegeeks.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
// Geeks clas with functions insert and freq
// insert : to insert element into ArrayList
// freq : function to count frequency of element

//Explanation:
//Testcase 1: Inserting g, e, e, k, s into the list. Frequency of e is 2 in the list.
//Testcase 2: Inserting c, p, p into the list. Frequency of f is 0 in the list.
class Geeks
{
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter question size \n");
			int q = sc.nextInt();
			ArrayList<Character> clist = new ArrayList<>();
			while(q-- >0){
			
				char c = sc.next().charAt(0);
				if(c == 'i'){
					Geeks.insert(clist,sc.next().charAt(0));					
				}
				if(c == 'f'){
					Geeks.freq(clist, sc.next().charAt(0));
				}
			}
			
		}
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        clist.add(c);
        //add c to clist
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
        int i =  Collections.frequency(clist,c);
        if(i!=0)
        System.out.println(i);
        else
        System.out.println("Not Present");
        
    }
}
