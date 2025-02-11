package Arrays;

public class Seconf_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3 , 5 ,7 , 2, 8, 1};

		System.out.println(getSecondLargest(arr));

	}
	public static int getSecondLargest(int[] arr) {
        // Code Here
		int n   = arr.length;
        int maxel = arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]>maxel){
                maxel = arr[i];
            }
        }
        int secondMax = -1;
        for(int i=0;i<=n-1;i++){
            if(arr[i]>secondMax&&arr[i]!=maxel){
                secondMax = arr[i];
            }
        }
        
        return secondMax;
        
        
    }

}
