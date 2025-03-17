package Binary_Search;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {-1,0,3,5,9,12};
		System.out.println(search(arr,4));

	}
	public static int search(int[] nums, int target) {
        int n   = nums.length;
        int low = 0;
        int high= n-1;
        //int mid = (high + low)/2;
        while(low<=high){
            int mid = (high + low)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
        
    }

}
