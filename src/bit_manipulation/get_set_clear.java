package bit_manipulation;

public class get_set_clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 975;
		int n = num ;
		int i = 10;
        //i -= 1;
        
		String s = "";
		
		while(n>0) {
			int rem=n%2;
			
			s = s + rem;
			n=n/2;
			
		}
		System.out.println(s);
		
		if(s.length()<=i) {
			System.out.println(false);
			return;
		}
		
		int ans1 = s.charAt(i);
		if(ans1==1) System.out.println(true);
		else System.out.println(false);
//		int ans2 = 0;
//		int ans3 = 0;
//		
//		if(ans1 == 1){
//		    ans2 = num;
//		    ans3 = num - (int)Math.pow(2,i);
//		}else{
//		    ans3 = num;
//		    ans2 = num + (int)Math.pow(2,i);
//		}
//		
//		
//		System.out.println(ans1+" "+ans2+" "+ans3);

	}

}
