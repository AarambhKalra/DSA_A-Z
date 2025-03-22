package Bs_on_1D;

public class min_days_to_make_m_bouqets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1000000000,1000000000};
		
		System.out.println(minDays(arr,1,1));

	}
	public static int minDays(int[] bloomDay, int m, int k) {
		int n = bloomDay.length;
        int max = findMax(bloomDay);
        int min = findMin(bloomDay);
        if(m*k>n) return -1;
        int low = min;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(canMakeBouquets(bloomDay,mid,m,k)) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        // for(int day=min;day<=max;day++){
        //     if(canMakeBouquets(bloomDay,day,m,k)) return day;
        // }
        return ans;
    }

	 private static boolean canMakeBouquets(int[] bloomDay, int day, int m, int k) {
	        int bouquets = 0, flowers = 0;
	        for (int bloom : bloomDay) {
	            if (bloom <= day) {
	                flowers++;
	                if (flowers == k) {
	                    bouquets++;
	                    flowers = 0;
	                    if (bouquets == m) return true;
	                }
	            } else {
	                flowers = 0;
	            }
	        }
	        return bouquets >= m;
	    }

    public static int findMin(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(arr[i],min);
        }
        return min;
    }

    public static int findMax(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }

}
