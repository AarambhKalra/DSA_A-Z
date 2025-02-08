package Learn_the_basics;
import java.util.*;

public class fibo {

public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		//int sum=0;
		int f=0;
		int  b=1;
    	int  a=0;
		//System.out.print("0");
		
        for(int i=1;i<=n;i++) {
    	
            
	
    	 f=a+b;
    	 a=b;
         b=f;
    	 
    	 
	}
        System.out.print(a);
	s.close();

		
	}

}
