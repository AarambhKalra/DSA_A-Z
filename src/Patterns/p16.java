package Patterns;

public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n   = 3;
		int row = 1;
        int nst = 1;
        char val=65;
        
        
        while(row<=n){
            
            int cst=1;
            while(cst<=nst){
                System.out.print(val+" ");
                cst++;
            }
            val++;
            row++;
            nst++;
            System.out.println();
        }

	}

}
