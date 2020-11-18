package loops;

public class testNestedForloop {
	public static void main(String[] args) {

		int stars = 5;
		for(int row = 1;row<=stars;row++) {
			for(int col = 1;col<=row;col++) {
				if(col == row) {
				System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
