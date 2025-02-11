package Arrays;

public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,4,4,4,5};
		int i = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println(i+1);
        for(int j=0;j<arr.length;j++){
        	System.out.print(arr[j]);
        }

	}

}
