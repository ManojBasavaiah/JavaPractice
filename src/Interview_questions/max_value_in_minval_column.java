package Interview_questions;

public class max_value_in_minval_column {
    public static void main(String[] args) {
        // Initialize the 2D array
        int[][] arr = {{2, 4, 5}, {3, 0, 7}, {1, 2, 9}};

        // Find the minimum value and its column index
        int min = arr[0][0];
        int minColumn = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minColumn = j;
                }
            }
        }

        // Print the minimum column index and value
        System.out.println("Minimum column index: " + minColumn);
        System.out.println("Minimum value: " + min);

        // Find the maximum value in the column with the minimum value
        int max = arr[0][minColumn];
        int rows = 0;
        while (rows < 3) {
            if (arr[rows][minColumn] > max) {
                max = arr[rows][minColumn];
            }
            rows++;
        }

        // Print the maximum value
        System.out.println("Maximum value: " + max);
    }
}
