package Interview_questions;

public class array {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max=arr[0][0];
        int max_column=0;
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]>max) {
                    max = arr[i][j];
                    max_column = j;
                }
            }
        }
        System.out.println("max value: "+max);
        System.out.println("max column: "+max_column);
        int min=arr[0][max_column];
        int min_row=0;
        while(min_row<3) {
            if (arr[min_row][max_column] < min) {
                min = arr[min_row][max_column];
            }
            min_row++;
        }


        System.out.println("min value: "+min);
        System.out.println("min row: "+min_row);
    }
}
