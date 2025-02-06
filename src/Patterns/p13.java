package Patterns;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		 int row = 1;
	        int nst = 1;
	        int val=1;
	        while(row<=n){
	            int cst=1;
	            while(cst<=nst){
	                System.out.print(val);
	                cst++;
	                val++;
	            }
	            row++;
	            nst++;
	            System.out.println();
	        }

	}

}
