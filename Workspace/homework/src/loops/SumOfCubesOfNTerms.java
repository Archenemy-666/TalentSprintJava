package loops;

import java.util.*;

public class SumOfCubesOfNTerms {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Total values considered : ");
		int limit = scan.nextInt();

		int count = 0;
		int sum = 0;

		for (double i = 1; count < limit; i++) {
			double x = Math.pow(i, 3);

			sum += x;
			count++;
			System.out.println(sum);
		}
		// System.out.println(sum);
	}
}
