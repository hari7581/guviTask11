package guviTask11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		File fn = new File("hari.txt"); 

        try {
            Scanner scanner = new Scanner(fn);
            // Read data from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
			scanner.close();
        } catch (FileNotFoundException e) {
            // File not found exception handling
            System.out.println("File not found: " + e);
        }
	}

}

// Output :
//	File not found: java.io.FileNotFoundException: input.txt (The system cannot find the file specified)