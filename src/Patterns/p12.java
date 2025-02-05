package Patterns;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int row = 1;
        int nst = 1;
        int nsp = 2*n-2;
        while(row<=n){
            int cst=1;
            int csp=1;
            int cst1=nst;

            while(cst<=nst){
               // System.out.print(cst+" ");
                System.out.print(cst);

                cst++;
            }

            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            while(cst1>=1){
               // System.out.print(cst1+" ");
                System.out.print(cst1);
                cst1--;
            }

            row++;
            nst++;
            nsp-=2;
            System.out.println();


    
        }
		

	}

}
