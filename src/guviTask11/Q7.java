package guviTask11;

import java.util.Scanner;

public class Q7 {
	// Custom Exception class for Invalid Age
	static class InvalidAgeException extends Exception {
		public InvalidAgeException(String message) {
			super(message);
		}
	}

	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or older");
		} else {
			System.out.println("Age is valid");
		}
	}

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();
			validateAge(age);
			scanner.close();
		} catch (InvalidAgeException e) {
			// Handle the exception by displaying an error message
			System.out.println("Error Details : " + e.getMessage());
		}
	}

}

// Output :
//	Enter your age: 14
//	Error Details : Age must be 18 or older