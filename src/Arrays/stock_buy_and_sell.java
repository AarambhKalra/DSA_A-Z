package Arrays;

public class stock_buy_and_sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,1,2,4,6};
		 int maxPro = 0;
		    int minPrice = Integer.MAX_VALUE;
		    for (int i = 0; i < arr.length; i++) {
		        if(arr[i]<minPrice){
		            minPrice = arr[i];
		        }
		        if(arr[i]-minPrice>maxPro){
		            maxPro = arr[i]-minPrice;
		        }
		    }
		    System.out.println(maxPro);

	}

}
