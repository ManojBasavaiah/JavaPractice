package Interview_questions;

import java.util.regex.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        // Remove special characters and spaces
        String modified = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Check if the modified string is equal to its reverse
        return modified.equals(new StringBuilder(modified).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama!"));  // Output: true
        System.out.println(isPalindrome("race car"));  // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
        System.out.println(isPalindrome("Malayalam"));// Output: true
    }
}
