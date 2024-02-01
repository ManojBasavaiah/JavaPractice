package Interview_questions;

public class missingNumber2 {
    private static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 6, 5, 3};
        int missingNumber = findMissingNumber(ar);
        System.out.println("Missing number is " + missingNumber);

    }
}
