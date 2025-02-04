package Codes;

public class reverse_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-156));
	}
	
	public static int reverse(int x) {
		
        int digit=0;
        int num=0;
        
        while(x!=0){
            digit=x%10;
            num=(num*10)+digit;
            x /= 10;
        }
		return nu;
	}
}
