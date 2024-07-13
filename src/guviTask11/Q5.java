package guviTask11;

public class Q5 {

	public static void main(String[] args) {

		try {
			int[] array = { 1, 2, 3, 4, 5 };
			int element = array[7];
			System.out.println("Element at index : " + element);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Details : " + e);

		}
		try {
			String str = "Hello";
			char character = str.charAt(10);
			System.out.println("Character at index 10: " + character);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error Details : " + e);
		}
	}
}

// Output :
//	 Error Details : java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
//	 Error Details : java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 5