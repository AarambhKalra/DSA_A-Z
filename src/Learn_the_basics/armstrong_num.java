package Learn_the_basics;
import java.util.Scanner;

public class armstrong_num {

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		int ogn = n;

		int k = countDigits(n);
		
		int sum=0;
		
		for(int i=1;i<=k;i++) {
			int digit =n%10;
			sum += (int)Math.pow(digit, k);
			n=n/10;					
		}
		
		if(sum==ogn) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		s.close();

	}

	static int countDigits(int n){
		int count = 0;
		while(n>0){
			n = n/10;
			count++;
		} return count;
	}

}
