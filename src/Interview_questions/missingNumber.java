package Interview_questions;

public class missingNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        //1+2+5+6= 18
        //1+2+3+4+5+6=21
        //21-18=4
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];//17
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int j = 1; j <= 6; j++) {
            sum1 += j;//21
        }
        System.out.println(sum1);
        System.out.println("missingNumber:::" + (sum1 - sum));
    }
}
