package Recursion_Basic;
import java.util.*;

public class palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "race a caraaaaa";
		s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(isPalindrome(0,s));
	}
	public static boolean isPalindrome(int i ,String s) {
		if(i<=s.length()/2) {
			return true;
		}
		if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
			return false;
		}
		
		return	isPalindrome(i+1,s);
			
		
        
	}

}
