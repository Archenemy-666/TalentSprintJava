package methods;

import java.util.Scanner;

public class CheckforPerfectNumber {
	public static boolean perfectNumberCheck(int num) {
		int sum = 1;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the number to be checked : ");
		int num = scan.nextInt();

		System.out.println("is it perfect : " + perfectNumberCheck(num));
		;

	}
}
