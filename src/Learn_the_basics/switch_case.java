package Learn_the_basics;


public class switch_case {

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub

	}


	// User function Template for Java

	class Solution{
	    static double switchCase(int choice, List<Double> arr){
	        // code here
	        switch (choice) {
	            case 1:
	                // Circle area calculation (π * R * R)
	                if (arr.size() == 1) {
	                    double radius = arr.get(0);
	                    return Math.PI * radius * radius;
	                }
	                break;
	                
	            case 2:
	                // Rectangle area calculation (L * B)
	                if (arr.size() == 2) {
	                    double length = arr.get(0);
	                    double breadth = arr.get(1);
	                    return length * breadth;
	                }
	                break;
	                
	            default:
	                return -1;
	        }
	        return 0;
	    }
	}

}
