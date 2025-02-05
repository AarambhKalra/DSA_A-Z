package Patterns;
import java.util.Scanner;
public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
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

	}
}
