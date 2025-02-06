package Patterns;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		 int row = 1;
	        int nst = 1;
	        
	        
	        while(row<=n){
	            char val=65;
	            int cst=1;
	            while(cst<=nst){
	                System.out.print(val+" ");
	                val++;
	                cst++;
	            }
	            row++;
	            nst++;
	            System.out.println();
	        }

	}

}
