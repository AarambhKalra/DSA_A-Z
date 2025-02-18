package Arrays;
import java.util.Arrays;

public class rotate_matrix {

	    static void transpose(int[][] mat) {
	        int n = mat.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = i+1; j < n; j++) {
	                int temp = mat[i][j];
	                mat[i][j] = mat[j][i];
	                mat[j][i] = temp;
	            }
	        }
	    }

	    // Driver code
	    public static void main(String[] args) {
	        int[][] mat = {
	            { 1, 1, 1, 1 },
	            { 2, 2, 2, 2 },
	            { 3, 3, 3, 3 },
	            { 4, 4, 4, 4 }
	        };

	        transpose(mat);
	        reverse(mat);

	        System.out.println("Modified matrix is:");
	        for (int[] row : mat) {
	            System.out.println(Arrays.toString(row));
	        }
	    }

		private static void reverse(int[][] mat) {
			int n = mat.length;
			// TODO Auto-generated method stub
			for(int i=0;i<n;i++){
	            for(int j=0;j<n/2;j++){
	                int temp = mat[i][j];
		                mat[i][j] = mat[i][n-j-1];
		                mat[i][n-j-1] = temp;
	            }
	        }
			
		}
	

}
