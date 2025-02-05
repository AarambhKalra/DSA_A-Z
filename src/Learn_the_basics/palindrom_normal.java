package Learn_the_basics;

public class palindrom_normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(343));
	}
	
	public static boolean reverse(int x) {
		int temp=x;
        int digit=0;
        int num=0;
        
        while(temp!=0){
            digit=temp%10;
            num=(num*10)+digit;
            temp /= 10;
        }
        if(num==x) {
        	return true;
        }else {
        	return false;
        }
        
	}

}
