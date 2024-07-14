package guviTask11;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// user to enter the first integer
		System.out.println("Enter the first integer: ");
		int n1 = scanner.nextInt();
		// user to enter the second integer
		System.out.print("Enter the Second integer: ");
		int n2 = scanner.nextInt();

		try {
			int n3 = n1 / n2;
			// Print the result of the division
			System.out.println("The value of n3 : " + n3);
		} catch (ArithmeticException e) {
			// Handle the case where division by zero occurs
			System.out.println("Error: Division by zero is not allowed. " + e);
		} catch (Exception e) {
			// Handle any other exceptions
			System.out.println("Error: Invalid input. Please enter integers only." + e);
		}
		scanner.close();
	}

}

// Output :
//	     Enter the first integer: 
//		 45
//		 Enter the Second integer: 0
//		 Error: Division by zero is not allowed. java.lang.ArithmeticException: / by zero
