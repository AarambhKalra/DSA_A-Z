package Recursion_Basic;
import java.util.ArrayList;
public class factorial_gfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialNumbers(100));

	}
	
	 static ArrayList<Long> factorialNumbers(long n) {
	        
	        ArrayList<Long> result = new ArrayList<>();

	        
	        findFactorials(n, 1, 1, result);

	        return result;
	        
	    }
	    
	    static void findFactorials(long n, long factorial, int i, ArrayList<Long> result) {
	        // Base condition: Stop recursion if factorial exceeds n
	        if (factorial > n) return;

	        // Add the current factorial to the result list
	        result.add(factorial);

	        // Calculate the next factorial and recurse
	        findFactorials(n, factorial * (i + 1), i + 1, result);
	    }

}
