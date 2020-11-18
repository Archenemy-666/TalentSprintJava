package methods;

import java.util.Scanner;

public class Pallindrome {
	public static int reverse(int num) {
		
		int reversedInt = 0, remainder, inputInt;

		inputInt = num;

		while (num != 0) {
			remainder = num % 10;
			reversedInt = reversedInt * 10 + remainder;
			num = num / 10;
		}
		return reversedInt;

	}
	
	public static boolean isPallindrome(int num ){
		if (num == reverse(num))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		System.out.println(isPallindrome(num));
	}
	

}
