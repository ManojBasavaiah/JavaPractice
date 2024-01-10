public class sortingAnarray {
    /**
     * Sorts an array of integers in ascending order using the bubble sort algorithm.
     *
     * @param arr The array of integers to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                // Swap if the current element is greater than the next element
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //		swapping without using extra variable.
//		int a=1;
//		int b=2;
//		a=a+b;//3
//		b=a-b;//3-2=1
//		a=a-b;//2
//		System.out.println(a);
//		swapping using extra variable.
//		int a=1;
//		int b=2;
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
        int[] arr = {2, 5, 3, 9, 6};

        // Sort the array using bubble sort
        bubbleSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
