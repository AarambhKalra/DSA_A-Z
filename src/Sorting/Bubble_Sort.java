package Sorting;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3 , 5 ,7 , 2, 8, 1};
		int n = arr.length;
		
		for(int i = 0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
		
		
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
            	if (arr[j] > arr[j +1]) {
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        

	}

}
