package Recursion_Basic;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int start = 0;
        int end = arr.length - 1;  
        
        reverseArray(arr , start, end);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}
	static void reverseArray(int arr[] , int start , int end ){

        if(start > end ){

            return;

        }

        int temp = arr[start];

        arr[start] = arr[end];

        arr[end] = temp ;

        reverseArray(arr ,  start+1  , end -1 );

    }

}
