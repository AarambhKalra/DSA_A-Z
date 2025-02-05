package Recursion_Basic;

public class reverse_Array_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Use a traditional for loop with index for printing to avoid any confusion.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
