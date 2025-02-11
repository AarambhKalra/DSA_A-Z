package Sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3 , 5 ,7 , 2, 8, 1};
		int n = arr.length;
		
		for(int i = 0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
		
		
		for (int i = 0; i < n; i++) {
            int j =i;
            while(j>0&&(arr[j-1]>arr[j])){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
		
		
		System.out.println();
        for(int i = 0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
	}
}
