//freq of num 1 to n (excluding 0)


package Hashing;
import java.util.*;
public class return_freq_list {
	
 
	public static void main(String[] args) {
		
		int[] arr = {1,3,7,2,1,1,3};
		frequencyCount(arr);
		
		
	}
	
	public static void frequencyCount(int[] arr) {
        // do modify in the given array
        List<Integer> a = new ArrayList<Integer>();  
        
        int[] hash = new int[arr.length+1];
		for(int i = 0;i < arr.length; i++) {
			hash[arr[i]] += 1;
		}
		
        for(int i=1;i<=arr.length;i++){
           a.add(hash[i]);
        }
        System.out.println(a);
    }
	
	
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {1,3,7,2,1,1,3};
//		List<Integer> a = new ArrayList<Integer>();  
//        for(int i=0;i<arr.length;i++){
//           a.add(check(i,arr));
//        }
//        System.out.println(a);
//		
//
//	}
//	static int check(int n , int[] arr){
//        int count=0;
//        
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==n){
//                count++;
//            }
//        }
//        
//        return count;
//    }

}
