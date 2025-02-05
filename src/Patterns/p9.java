package Patterns;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int row = 1;
        int nst = 1;
        int nsp = n-1;
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

            nst+=2;
            nsp--;
            row++;
            System.out.println();
            }

		///////////////////////////////////////////////////
		int row1 = 1;
        int nst1 = 2*n-1;
        int nsp1 =0;
        while(row1<=n){
            int cst=1;
            int csp=1;
            
            while(csp<=nsp1){
                System.out.print(" ");
                csp++;

            }

            while(cst<=nst1){
                System.out.print("*");
                cst++;

            }

            nst1-=2;
            nsp1++;
            row1++;
            System.out.println();

    }

	}

}
