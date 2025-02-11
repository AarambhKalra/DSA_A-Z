package Arrays;

public class move_zero_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 0, 0, 5};
		int n = a.length;
		int zeroIndex  = 0; // Tracks the index where the next non-zero element should be placed

		for (int i = 0; i < n; i++) {
		    if (a[i] != 0) {
		        // Swap a[i] with the element at nonZeroIndex
		        int temp = a[zeroIndex ];
		        a[zeroIndex ] = a[i];
		        a[i] = temp;
		        zeroIndex ++; // Increment nonZeroIndex to be ready for next non-zero element
		    }
		}

		for (int k = 0; k < n; k++) {
		    System.out.print(a[k] + " ");
		}

	}

}
