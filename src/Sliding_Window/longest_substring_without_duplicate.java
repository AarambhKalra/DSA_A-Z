package Sliding_Window;
import java.util.HashMap;


public class longest_substring_without_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew" ;
		System.out.println(lengthOfLongestSubstring(s));

	}
	public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int n = s.length();
        int len = 0;
        int max = Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                len = 0;
                System.out.println(i+" "+len+" "+max+" "+c);
            }else{
            	System.out.println(i+" "+len+" "+max+" "+c);
                map.put(c,1);
                len ++;
            }
            max = Math.max(len,max);

        }   
        return max;
    }

}
