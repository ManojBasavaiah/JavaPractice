package Interview_questions;

public class MinAndMaxvalueofarray {
    /**
     * This method finds the minimum value in a 2D array and prints it.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Define the 2D array
        int[][] arr = {{1, 2, -10, 6}, {4, 5, 6, 17}, {250, 8, 9, 44}};

        // Set the initial minimum value as the first element of the array
        int min = arr[1][0];
        int max = arr[0][0];

        // Iterate through each element of the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // Check if the current element is smaller than the current minimum value
                if (arr[i][j] < min) {
                    // Update the minimum value
                    min = arr[i][j];
                } else if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        // Print the minimum value
        System.out.println("Minimum value in an array::: " + min);
        System.out.println("Maximum value in an array::: " + max);
    }
}
