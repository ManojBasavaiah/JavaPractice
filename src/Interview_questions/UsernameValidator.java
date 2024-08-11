package Interview_questions;
import java.util.regex.*;

public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        // Regular expression to match any letter in any language, special characters, and numbers
        String regex = "^[\\p{L}\\p{N}\\p{Punct}]+$";
//        ^ : start of the line
//        \p{L} : any kind of letter from any language
//        \\
//        0-9 : digits
//        _ : underscore
//        - : hypen
//        + : one or more occurrences
//        $ : end of the line
        // Check if the username matches the regular expression
        return username.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValidUsername("user123"));  // Output: true
        System.out.println(isValidUsername("user_123")); // Output: true
        System.out.println(isValidUsername("user@example.com")); // Output: true
        System.out.println(isValidUsername("用户123")); // Output: true
        System.out.println(isValidUsername("😊user")); // Output: false
    }
}
