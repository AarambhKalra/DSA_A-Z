package Recursion_Basic;

import java.util.Scanner;

public class fibo_recursive {

public static void main(String[] args) {

		
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();

		if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        } else if (n == 1 || n == 2) {
            System.out.print(1);
        }else {
		System.out.print(fib(n));
        }
	    s.close();
	}

	public static int fib(int n) {
		if (n <= 1){
			return n ;
		}else {
            return fib(n - 1) + fib(n - 2);
        }
    }


}
