import java.util.Scanner;

public class Stringreverse {

    public static void main(String[] args) {
//		Palindrome MALAYALAM=MALAYALAM
//		LHS=RHS
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String t = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            t = t + str.charAt(i);
        }
        System.out.println(t);
        if (str.equalsIgnoreCase(t)) { //str==t will not work as .equals()
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

}
