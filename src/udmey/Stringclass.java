package udmey;

public class Stringclass {

	public static void main(String[] args) {
		// Define input strings
		String str = " Java Programming";
		String str2 = "JavaTraining";

		// Print character at index 4 of str
		System.out.println(str.charAt(4));

		// Concatenate " Rahul Shetty" to str and remove leading/trailing whitespace
		System.out.println(str.concat(" Rahul Shetty").trim());

		// Split str2 by "T" and store the resulting substrings in an array
		String[] arr = str2.split("T");

		// Print the first substring
		System.out.println(arr[0]);

		// Print the second substring
		System.out.println(arr[1]);

		// Remove leading/trailing whitespace from str and convert it to a character array
		String s = str.trim();
		char[] charArray = s.toCharArray();

		// Print the characters in reverse order
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i] + "");
		}
	}
}
