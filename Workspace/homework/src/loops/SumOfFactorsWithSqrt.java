package loops;

import java.util.*;

public class SumOfFactorsWithSqrt {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		double num = scan.nextDouble();
		double sum = 0;
		for (double i = 2; i <= Math.sqrt(num); i++) {

			if (num % i == 0) {
				if (i == (num / i)) {
					sum = sum + i;
				} else {
					sum = sum + (i + num / i);
				}
				

			}
			
		}
		System.out.println(sum + num + 1);
	}
}
