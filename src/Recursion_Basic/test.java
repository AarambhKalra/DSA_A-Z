package Recursion_Basic;
import java.util.Arrays;

public class test {

	public static void main(String[] args) { 		// TODO Auto-generated method stub 		
		String s = "A man, a plan, a canal: Panama";
		s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }

        char[] brr = new char[s.length()];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = s.charAt(i);
        }	
		reverseArray(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);		         
			}	 		 		
		System.out.println(); 		         
		if(Arrays.equals(arr, brr)) {         	
			System.out.println(true);;         
			
		}else {         	
			System.out.println(false);
			} 		  	
		} 	
	static void reverseArray(char arr[] , int start , int end ){  	         
		if(start >= end ){  	            
			return;  	         
			}  	         
		char temp = arr[start];
		arr[start] = arr[end]; 
		arr[end] = temp ;  
		reverseArray(arr ,  start+1  , end -1 );  	     
		}
}


