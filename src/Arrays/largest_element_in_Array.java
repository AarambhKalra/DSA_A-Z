package Arrays;

public class largest_element_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3 , 5 ,7 , 2, 8, 1};
		
		System.out.println(largest(arr));

	}
	public static int largest(int[] arr) {
        // code here
        int n   = arr.length;
        int maxel = arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]>maxel){
                maxel = arr[i];
            }
        }
        return maxel;
    }

}
