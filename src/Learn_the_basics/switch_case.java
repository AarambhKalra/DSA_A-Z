package Learn_the_basics;
import java.util.*;

public class switch_case {

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		ArrayList<Double> arr = new ArrayList<Double>();
		System.out.println("Press 1 for area\nPress 2 for Rectangle");
		int choice=s.nextInt();
		
		if(choice==1) {
			for(int i=0;i<1;i++) {
				double input=s.nextDouble();
				arr.add(input);
			}			
			System.out.println(switchCase(choice,arr)); 
			
		}else {
			for(int i=0;i<=1;i++) {
				double input=s.nextDouble();
				arr.add(input);
			}
			System.out.println(switchCase(choice,arr)); 
		}
		

	}


	// User function Template for Java
	   static double switchCase(int choice, ArrayList<Double> arr){
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


