package methods;

import java.util.Scanner;

public class CheckPrimeMethod {
	public static boolean primeCheck(int num) {

		if (num == 1 || num == 2) {
			return true;
		}
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				return false;

			}

		}
		return true ;
		}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number to check for prime");
		int num = scan.nextInt();

		System.out.println("Is num prime : " + primeCheck(num));
	}
}
