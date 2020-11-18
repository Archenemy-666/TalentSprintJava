package methods;

import java.util.Scanner;

public class SumOfFactors {
	
	public static double factorsSum(double num) {


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
		return sum + num + 1 ;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		double num = scan.nextDouble();
		System.out.println(factorsSum(num));
	}
}


