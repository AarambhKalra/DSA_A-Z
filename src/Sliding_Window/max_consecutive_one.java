package Sliding_Window;

public class max_consecutive_one {

	public static void main(String[] args) {
		// TODO Auto-generatlongestOneed method stub
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		
		System.out.println(longestOnes(nums,2));

	}
	 public static int longestOnes(int[] nums, int k) {
	        int n = nums.length;
	        int len = 0;
	        int max = Integer.MIN_VALUE;
	        for(int i=0;i<n;i++){
	        	int klen = 0;
	            for(int j=i;j<n;j++){
	                if(klen<k){
	                    if(nums[j]==0) klen++;
	                    len = j-i+1;
	                    max = Math.max(len,max);
	                }else{
	                    if(nums[j]==1){
	                    len = j-i+1;
	                    max = Math.max(len,max);
	                    }else{
	                        i = j-2;
	                        klen = 0;
	                    }

	                }
	            }
	        }
	        return max;
	    }


}
