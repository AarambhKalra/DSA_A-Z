package Learn_the_basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class user_input_output {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		Scanner s = new Scanner(System.in);
		
		System.out.println("What's your Name");
		
		String input = s.next();
		
		System.out.println("Welcome Dear "+ input);
		
		string_buffer();
		
		s.close();
		
	}
                  /*STRING BUFFER INPUT FOR FILE OR NETWORK*/
	static void string_buffer() throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		System.out.println("What' your age:");
		String input = bf.readLine();
		int num = Integer.parseInt(input);
		int age = 2024-num;
		System.out.println("You were born in year "+age);
		
	}
}
