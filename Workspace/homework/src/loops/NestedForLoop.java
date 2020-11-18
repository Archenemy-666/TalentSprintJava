package loops;

public class NestedForLoop {
	public static void main(String[] args) {
		for(char c = 'A';c <= 'C';c++) {
			for(int n = 1;n<= 3 ; n++) {
				System.out.print(c+""+n+ " ");
			}
			System.out.println();
		}
	}
}
