package Bs_on_1D;

public class min_in_rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,7,0,1,2,3,4};
		
		System.out.println(findMin(arr));

	}
	public static int findMin(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
//        int ans = Integer.MAX_VALUE;
        while (low < high) {
            int mid = (low + high) / 2;

            // if mid points to the target
            int temp = arr[mid];

//            ans = Math.min(temp,ans);
//            System.out.println(ans);
            

            // if left part is unsorted
            if (arr[low] > arr[mid]) {
                high = mid;
            } else if(arr[mid] > arr[high]) { // if right part is sorted
                low = mid+1;
            }
        }
        return arr[low];

    }

}
