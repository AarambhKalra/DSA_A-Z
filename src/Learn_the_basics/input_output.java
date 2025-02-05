package Learn_the_basics;

import java.io.*;
import java.net.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;



public class input_output {
	public static void main(String[] args) throws IOException {
        File file = new File("count_digits.java"); // Replace "input.txt" with the actual file path
        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);

        // Read data from the file using scanner
        // ...

        scanner.close(); 
        fis.close();
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        
        Socket socket = new Socket("www.linkedin.com/in/aarambh-kalra", 80); // Replace with actual hostname and port
        InputStreamReader reader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(reader);

        // Read data from the socket using bufferedReader
        // ...

        bufferedReader.close();
        reader.close();
        socket.close();
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        
        String inputString = "This is a sample input string.";
        Scanner scan = new Scanner(inputString);

        // Read data from the string using scanner
        // ...

        scan.close();
    }
}
