package Arrays;

public class left_rotate_by_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,2,3,4,5,6};
		 int n = arr.length;
		
		 int temp = arr[0];
	        for(int j=0;j<n-1;j++){
	            arr[j]=arr[j+1];                    
	        }
	        arr[n-1] = temp;
	       for(int i=0;i<arr.length;i++) {
	    	   System.out.print(arr[i]);
	       }


	}

}
