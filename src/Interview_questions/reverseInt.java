package Interview_questions;

public class reverseInt {
    public static void main(String[] args) {
        //1st method
        int num = 12345;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of int: " + rev);
// 2nd method
        int num1 = 123456789;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}