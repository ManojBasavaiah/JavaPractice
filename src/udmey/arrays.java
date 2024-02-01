package udmey;

public class arrays {

	public static void main(String[] args) {
//		Single dimension Array
		int[] a =new int[4]; //Declaration of array
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4; //Intialize
		int[] b = {1, 2, 3, 4, 5, 6}; //other method to intialize
		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
		}//print
//			Multi dimentional array
			int rows=2, columns=2;
		int[][] arr =new int[rows][columns];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println(arr[i][j]);
			}
		}
		int[][] arr2 ={{1, 2, 3, 4},{5,6,7}};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}}


