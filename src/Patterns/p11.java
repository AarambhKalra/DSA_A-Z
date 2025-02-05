package Patterns;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n   = 5;
		int row = 1;
        int nst = 1;
        while(row<=n){
            int cst=1;

            if(nst%2!=0){
                while(cst<=nst){
                    if(cst%2!=0){
                        System.out.print("1 ");
                        cst++;
                    }else{
                        System.out.print("0 ");
                        cst++;
                    }
                }
            }else{
                while(cst<=nst){
                    if(cst%2!=0){
                        System.out.print("0 ");
                        cst++;
                    }else{
                        System.out.print("1 ");
                        cst++;
                    }
                }
            }

            nst++;
            row++;
            System.out.println();

	}

}
}
