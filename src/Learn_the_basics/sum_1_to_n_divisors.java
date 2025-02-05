package Learn_the_basics;

public class sum_1_to_n_divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfAllDivisors(99999));

	}
	 public static int sumOfAllDivisors(int n){
	        // Write your code here.

	        int sum = 0;

	        for(int i=1;i<=n;i++){
	            int lsum = 0;
	            for(int j=1;j<=i;j++){
	                if(i%j==0){
	                    lsum+=j;
	                }
	            }
	            sum+=lsum;
	        }

	        return sum;
	    }

}
