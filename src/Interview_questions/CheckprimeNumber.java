package Interview_questions;

import java.util.Scanner;

public class CheckprimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//number to be checked
        int f = 0;
        int m = a / 2;
        if (a == 0 || a == 1) {
            System.out.println("Not Prime Number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (a % i == 0) {
                    System.out.println("Not Prime Number");
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println("Prime Number");
            }
        }
    }
}