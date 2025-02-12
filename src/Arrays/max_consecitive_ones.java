package Arrays;

public class max_consecitive_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,1,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(arr));

	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max++;
                ans = Math.max(max,ans);
               // System.out.println(ans+" ");
            }else{
                max=0;
            }
        }
        return ans;
        
    }

}
