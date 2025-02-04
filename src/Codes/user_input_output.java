package Codes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class user_input_output {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		string_buffer();

		Scanner s = new Scanner(System.in);
		
		System.out.println("What's your Name");
		
		String input = s.next();
		
		System.out.println("Welcome Dear "+ input);
		
	
		s.close();
		
	}
                  /*STRING BUFFER INPUT FOR FILE OR NETWORK*/
	static void string_buffer() throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		String input = bf.readLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
		
	}
}
