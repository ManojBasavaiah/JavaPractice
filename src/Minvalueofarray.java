public class Minvalueofarray {
    /**
     * This method finds the minimum value in a 2D array and prints it.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Define the 2D array
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Set the initial minimum value as the first element of the array
        int min = arr[1][0];

        // Iterate through each element of the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if the current element is smaller than the current minimum value
                if (arr[i][j] < min) {
                    // Update the minimum value
                    min = arr[i][j];
                }
            }
        }

        // Print the minimum value
        System.out.println(min);
    }
}
