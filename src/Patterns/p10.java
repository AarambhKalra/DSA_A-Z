package Patterns;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		
		int row = 1;
        int nst = 1;
        
        while(row<=n){
            int cst=1;          
            
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }

            nst++;
            row++;
            System.out.println();
        }

		///////////////////////////////////////////////////
		int row1 = 1;
        int nst1 = n-1;
        
        while(row1<=n){
            int cst=1;          
            
            while(cst<=nst1){
                System.out.print("*");
                cst++;

            }

            nst1--;
            row1++;
            System.out.println();
	    }

	}
}
