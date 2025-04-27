package Stack;

public class subarray_sum_of_minimums {

	public static void main(String[] args) {

		int arr[] = {  3,1,2,4 };

		int sum = 0;
		int mod = (int) (1e9 + 7);

		for (int i = 0; i < arr.length; i++) {

			int mini = arr[i];

			for (int j = i; j < arr.length; j++) {

				mini = Math.min(mini, arr[j]);

				sum = (sum + mini) % mod;

			}
		}

		System.out.println(sum);
	}

}
