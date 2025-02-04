package Codes;
import java.util.Arrays;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-101));

	}
	public static boolean isPalindrome(int x) {
		if(x<0)return false;
        int size=countDigit(x);
        int temp1 = x;
        int temp2 = x;
        int arr[] = new int[size];
        int brr[] = new int[size];
        for(int i=size-1;i>=0;i--){
            arr[i]=temp1%10;
            temp1/=10;
        }
//        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        for(int i=0;i<size;i++) {
        	brr[i]=temp2%10;
        	temp2/=10;
        }
//        System.out.println(brr[0]+" "+brr[1]+" "+brr[2]);
        if(Arrays.equals(arr, brr)) {
        	return true;
        }else {
        	return false;
        }
        
    }
    static int countDigit(int n) {
       
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

}
