package Arrays;

import java.util.Arrays;

public class PrintMaxOfTheRow {
	public static void main(String[] args) {
		int maxMatrix[] = new int[3];
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int max = 0; 
			for (int i = 0 ; i < matrix.length ; i++) {
				for (int j = 0 ; j < matrix[i].length ; j++) {
							if(matrix[i][j] > max) {
								max = matrix[i][j];
							}
							
				}
				maxMatrix[i] = max;
			}
		
			System.out.println(Arrays.toString(maxMatrix));
	}
}
