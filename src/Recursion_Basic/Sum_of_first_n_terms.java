package Recursion_Basic;

public class Sum_of_first_n_terms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfSeries(5));
		

	}
    static int sumOfSeries(int n) {
        // code here
    	if(n==0){
            return 0;
        }
        return n*n*n + sumOfSeries(n-1);
    }

}
