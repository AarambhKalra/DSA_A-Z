package Arrays;

public class check_if_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,8,6,7};
		int n = a.length;
		int flag = 1;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                flag = 0;
                break;            
            } 
        }
        if(flag==0) {
        	System.out.println("false");
        }else {
        	System.out.println("true");
        }

	}

}
