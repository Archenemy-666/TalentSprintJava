package Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int sample [][] = {{1,2,3},{2,5},{1,4,7,2,3}};
		for(int i = 0 ; i<sample.length;i++) {
			for (int j = 0; j < sample[i].length;j++) {
				System.out.print(sample[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
