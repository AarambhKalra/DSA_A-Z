package Recursion_Basic;

import java.util.Arrays;

public class palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abba";
		s.toLowerCase();
		s = s.replaceAll("\\s", "");
		
		char[] arr = new char[s.length()];
		
		for(int i=0;i<arr.length;i++) {
		      arr[i]=s.charAt(i);
		}	
		for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);		
      }	
		
        char[] brr = new char[s.length()];
		
		for(int i=0;i<brr.length;i++) {
		      arr[i]=s.charAt(i);
		}	
		
		
		reverseArray(arr,1,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
              System.out.print(arr[i]);		
        }	
		
		System.out.println();
		
        if(Arrays.equals(arr, brr)) {
        	System.out.println(true);;
        }else {
        	System.out.println(false);;
        }
		

	}
	static void reverseArray(char arr[] , int start , int end ){

	         if(start > end ){

	             return;

	         }

	         char temp = arr[start];

	         arr[start] = arr[end];

	         arr[end] = temp ;

	         reverseArray(arr ,  start+1  , end -1 );

	     }

}
