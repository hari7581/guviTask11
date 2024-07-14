package guviTask11;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Set the correct password
		String correctPassword = "Hari7581";
		// user to enter the password
		System.out.print("Enter the password: ");
		String inputPassword = scanner.nextLine();

		try {
			validatePassword(inputPassword, correctPassword);
			System.out.println("Login successful!");
		} catch (IncorrectPasswordException e) {
			// Catch the custom exception
			System.out.println("Incorrect password. Please try again.");
		}
		scanner.close();
	}

	// Method to validate password
	public static void validatePassword(String input, String correctPassword) throws IncorrectPasswordException {
		if (!input.equals(correctPassword)) {
			throw new IncorrectPasswordException("Incorrect password provided.");
		}
	}

	// Custom Exception class for incorrect password
	static class IncorrectPasswordException extends Exception {
		public IncorrectPasswordException(String message) {
			super(message);
		}

	}

}

// Output :
//	 Enter the password: hari25478
//	 Incorrect password. Please try again.
