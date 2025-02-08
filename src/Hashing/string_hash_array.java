package Hashing;

import java.util.Scanner;

public class string_hash_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = sc.next();
		
		
		int[] hash = new int[256];
		for(int i = 0;i < s.length(); i++) {
			hash[s.charAt(i)] += 1;
		}
		
		
		System.out.println("Enter the num of elemnts u want to check");
		int q = sc.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=1;i<=q;i++) {
			char c = sc.next().charAt(0);
			System.out.println(hash[c]);			
		}
		
		sc.close();
		

	}

}
