package Learn_the_basics;

public class prime_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(9));

	}
	public static boolean isPrime(int num) {
		//Your code goes here
		if(num==1){
			return false;
		}else{
		
		    for(int i=2;i<num;i++){
			    if(num%i==0){
			    	return false;
			    }
				
			}
		
		}
		return true;
	}

	}


