package methods;

import java.util.Scanner;

public class NumbersDivisibleByThreeAndFive {

	public static void rangeDivisibilityCheck(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter start and end points : ");
		int start = scan.nextInt();
		int end = scan.nextInt();

		rangeDivisibilityCheck(start, end);

	}

}
