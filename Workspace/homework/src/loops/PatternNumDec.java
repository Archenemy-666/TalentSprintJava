package loops;

public class PatternNumDec {
	public static void main(String[] args) {

		int stars = 5;
		double x = 13.4 ;
		double y = 12.2 ;
		double c = x % y ;
		System.out.println(c);
		
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