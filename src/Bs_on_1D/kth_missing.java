package Bs_on_1D;

public class kth_missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,6,7,9};
		
		System.out.println(findKthPositive(arr,5));
		
		

	}
	public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=k) k++;
            else break;
        }
        return k;
    }

}
