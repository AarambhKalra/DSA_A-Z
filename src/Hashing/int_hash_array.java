package Hashing;
import java.util.*;

public class int_hash_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = s.nextInt();
		
		System.out.println("Enter elements in array");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int[] hash = new int[13];
		for(int i = 0;i < n; i++) {
			hash[arr[i]] += 1;
		}
		
		
		System.out.println("Enter the num of elemnts u want to check");
		int q = s.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=1;i<=q;i++) {
			int number = s.nextInt();
			System.out.println(hash[number]);			
		}
		s.close();
	}

}
