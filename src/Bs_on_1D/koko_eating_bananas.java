package Bs_on_1D;

public class koko_eating_bananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
		System.out.println(minEatingSpeed(arr,823855818));

	}
	public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(piles[i],max);
            //System.out.println(max);
        }
        
        for(int i=1;i<=max;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum = sum + ((piles[j] + i - 1) / i);
            }
            System.out.println(sum);
            if(sum<=h) return i;

        }

        return max;
    }
	
	public static int cap(int a,int b) {
		if(a%b != 0) {
			return (a/b)+1;
		}else
			return a/b;
		
	}

}
