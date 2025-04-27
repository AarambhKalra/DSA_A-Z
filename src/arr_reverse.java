
public class arr_reverse {

	public static void main(String[] args) {

		char[] arr = { 0, 1, 2, 3, 4, 5 ,5};
		
		int esum = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			
			if(arr[i]%2==0) esum++;
			
		}
		
		int osum = arr.length-esum;

		System.out.println("Even No " + esum);
		System.out.println("Odd No " + osum);

	}

}
