package Codes;

public class gcd_lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[2];
        arr = lcmAndGcd(24,36);
        System.out.println(arr[0]+" "+arr[1]);
	}
	 public static int[] lcmAndGcd(int a, int b) {
	        int[] arr = new int[2];
	        // code here
	        int result = Math.min(a, b);
	        while (result > 0) {
	            if (a % result == 0 && b % result == 0) {
	                break;
	            }
	            result--;
	        }
	        arr[1] = result;
	        
	        
	        int greater = Math.max(a, b);
	        int smallest = Math.min(a, b);
	        for (int i = greater;; i += greater) {
	            if (i % smallest == 0) {
	                arr[0]=i;
	                break;
	            }
	                 
	        }
	        
//	        int lcm = (a * b) / arr[1]; // Calculate LCM directly
//	        arr[0] = lcm;
	        return arr;
	    }

}
