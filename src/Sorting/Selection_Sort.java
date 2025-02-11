package Sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3 , 5 ,7 , 2, 8, 1};
		int n = arr.length;
		
		for(int i = 0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < n - 1; i++) {
        // Find the minimum element in unsorted array
        int min_idx = i; // Store the *index* of the minimum
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[min_idx]) {
                min_idx = j;  // Update the index of the minimum
            }
        }

        // Swap the found minimum element with the first element
        int temp = arr[i];
        arr[i] = arr[min_idx];
        arr[min_idx] = temp;
    }
        System.out.println();
        for(int i = 0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }

	}

}
