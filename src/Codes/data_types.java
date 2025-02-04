package Codes;

import java.util.Scanner;

public class data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		input.toLowerCase();
				
		System.out.println(dataTypeSize(input));
		
	}
	static int dataTypeSize(String str) {
        // code here
    
        
        if(str.equals("character"))
        return 2;
        else if(str.equals("integer"))
        return 4;
        else if(str.equals("long"))
        return 8;
        else if(str.equals("float"))
        return 4;
        else if(str.equals("double"))
        return 8;
        else 
        return -1;
    }

}
