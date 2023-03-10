public class MultidimensionalArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] c = { 7, 8, 9 };
		int[][] d = { a, b, c };

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
//while declaring array we cannot declare its size
	
/*int[][][] a = new int[][5][];    //Compile time error
         
int[][][] b = new int[5][][5];   //Compile time error
         
int[][][] c = new int[][5][5];   //Compile time error*/
	
	
	
	
}// diff ways of declaring multidimensional array
/*
 * //2D Arrays
 * 
 * int[][] a;
 * 
 * int a [][];
 * 
 * int[] a [];
 * 
 * //3D Arrays
 * 
 * int[][][] a;
 * 
 * int a[][][];
 * 
 * int[] a[][];
 * 
 * int[][] a[];
 * 
 * //4D Arrays
 * 
 * int[][][][] a;
 * 
 * int a[][][][];
 * 
 * int[] a[][][];
 * 
 * int[][] a[][];
 * 
 * int[][][] a[];
 * 
 */
