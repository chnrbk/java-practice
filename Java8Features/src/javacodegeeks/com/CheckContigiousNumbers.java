package javacodegeeks.com;

import java.util.*;
import java.lang.*;
import java.io.*;

class CheckContigiousNumbers {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=0;i<cases;i++) {
		   int sizeOfArray = sc.nextInt();
		   int[] numbers = new int[sizeOfArray];
		   Integer min=null, max=null;
		   int j=0;
		   System.out.println("Enter array numbers for case:"+i);
		   int inputArrayElement=sc.nextInt();
		   min=inputArrayElement;max=inputArrayElement;//3
		   numbers[j++]=inputArrayElement; //3 ;numbers[0]=3;j=1
		   while(j<sizeOfArray){ //1<2
			   inputArrayElement=sc.nextInt(); //3
		       numbers[j++]=inputArrayElement;//numbers[1]=4;
		       if(min>inputArrayElement) { //3>4
		    	   min=inputArrayElement; //
		       }
		       else if(max<inputArrayElement) { //3<4
		    	   max=inputArrayElement;
		       }
		   }
		   doPrint(min, max, numbers);
		   
		}
	}
	public static void doPrint(int min, int max, int[] numbers){
       int uniq=1+max-min;
	   if(uniq==1) {
	       System.out.println("Yes");
	       return;
	   }
	   boolean sort[]=new boolean[uniq];
	   for(int j=0;j<numbers.length;j++){
	       sort[numbers[j]-min]=true;
	   }
	   for(boolean b:sort){
	       if(!b){
	        System.out.println("No");  
	        return;
	       }
	   }
	   System.out.println("Yes");
	}
}