package Arrays;

import java.util.Arrays;

public class SumOf3x3Matrix {
	public static void main(String[] args) {
		int matrix1[][] = {{1,2,3} ,{4,5,6}, {7,8,9}};
		int matrix2[][] = {{3,4,5} ,{2,3,4}, {5,5,2}};
		int sumMatrix[][] = sum(matrix1,matrix2);
		
		System.out.println(Arrays.deepToString(sumMatrix));
	}
	public static int[][] sum(int matrix1[][],int matrix2[][]){
	int sumMatrix[][] = new int[3][3];
	
	for(int i = 0 ; i < matrix1.length ; i++) {
		for(int j = 0 ; j < matrix1[i].length ; j++ ) {
			sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j] ;
			}
		}
	return sumMatrix;
	}

}
