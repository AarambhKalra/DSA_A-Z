package Patterns;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		 int row = 1;
	        int nst = 2*n-1;
	        int nsp =0;
	        while(row<=n){
	            int cst=1;
	            int csp=1;
	            
	            while(csp<=nsp){
	                System.out.print(" ");
	                csp++;

	            }

	            while(cst<=nst){
	                System.out.print("*");
	                cst++;

	            }

	            nst-=2;
	            nsp++;
	            row++;
	            System.out.println();

	    }
    }
}
