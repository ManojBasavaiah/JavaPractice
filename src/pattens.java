import java.util.Scanner;

public class pattens {
    public static void main(String[] args) {
        int t = 2;
        System.out.println("Enter n value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < t; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}
