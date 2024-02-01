package Interview_questions;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        int a = value.length();
        String value1 = "";
        for (int i = a - 1; i >= 0; i--) {
            value1 = value1 + value.charAt(i);
        }
        System.out.print(value1);
        if (value1.equalsIgnoreCase(value)) {
            System.out.println("\n is palindrome");
        } else {
            System.out.println("not palindrome");
        }
        StringBuffer str = new StringBuffer(value);
        String str1 = str.reverse().toString();
        System.out.println(str1);
        String str2 = str.toString();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
