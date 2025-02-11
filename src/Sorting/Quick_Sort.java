package Sorting;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3 , 5 ,7 , 2, 8, 1};
		int n = arr.length;
		
        for(int i = 0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        
		quickSort(arr,0,n-1);
		
		System.out.println();
        for(int i = 0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }

	}
	static void quickSort(int arr[], int low, int high) {
        // code here
        if(low>=high) return;
        int part = partition(arr,low,high);
        quickSort(arr,low,part-1);
        quickSort(arr,part+1,high);
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot&&i<=high-1){
                i++;
            }
            while(arr[j]>pivot&&j>=low+1){
                j--;
            }
            if(i<j) swap(arr,i,j);
        }
        swap(arr ,low,j);
        return j;
    }
    
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }

}
