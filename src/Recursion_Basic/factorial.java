package Recursion_Basic;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialn(3));

	}
	
	
	static int factorialn(int n) {
		if(n==1) {
			return 1;
		}
		
		
		return n*factorialn(n-1);		
	}
}
