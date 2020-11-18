package methods;

import java.util.Scanner;

public class SumOfDigits {
	public static int digitsSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter num");
		int num = scan.nextInt();

		System.out.println("sum of digits is : " + digitsSum(num));

	}

}
