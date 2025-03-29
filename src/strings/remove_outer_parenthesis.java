package strings;

public class remove_outer_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));

	}
	public static String removeOuterParentheses(String s) {
        int n = s.length();
        int checkSum = 0;
        String ans = "";
        for(int i=0;i<n;i++){
            if(checkSum!=0){
                ans = ans + s.charAt(i);
            }
            if(s.charAt(i)=='('){
                checkSum++;
            }else {
            	if(checkSum>0) checkSum--;                 
            }
            if(checkSum==1 && s.charAt(i+1)==')'){
            	//System.out.println(s.charAt(i)+"   "+z+s.charAt(i));
                checkSum = 0;
            }
            System.out.println(checkSum);
        }
        return ans;
    }

}
