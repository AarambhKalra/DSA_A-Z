package Hashing;

import java.util.Scanner;
import java.util.HashMap;

public class int_hash_hashmap {

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
		
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i = 0;i < n; i++) {
			int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) freq = mp.get(key); // fetching from the map
            freq++;
            mp.put(key, freq);
        }
		
		
		System.out.println("Enter the num of elemnts u want to check");
		int q = s.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=1;i<=q;i++) {
			int number = s.nextInt();
			if (mp.containsKey(number)) System.out.println(i+ " -> "+ mp.get(number));
            else System.out.println(i+" -> "+ 0);		
		}
		s.close();

	}

}
