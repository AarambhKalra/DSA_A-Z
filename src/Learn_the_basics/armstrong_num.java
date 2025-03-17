package Learn_the_basics;
import java.util.Scanner;

public class armstrong_num {

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
		
		int n = length(num);
		int sum = 0;
		int ognum = num;
	    for(int i=1;i<n;i++){
			int temp = num%10;
			sum  = sum + (int)Math.pow(temp,n);
			num/=10;
		}

		if(sum == ognum){
			System.out.println(true);
		}else System.out.println(false);;
	}

	public static int length(int num){
		int count = 0;
		while(num>0){	
			num = num/10;
			count++;
		}
		return count;
	}}


