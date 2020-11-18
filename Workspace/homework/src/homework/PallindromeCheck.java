package homework;

import java.util.Scanner;

public class PallindromeCheck {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();

		int reversedInt = 0, remainder, inputInt;

		inputInt = num;

		while (num != 0) {
			remainder = num % 10;
			reversedInt = reversedInt * 10 + remainder;
			num = num / 10;
		}

		if (inputInt == reversedInt)
			System.out.println(inputInt + "  palindrome.");
		else
			System.out.println(inputInt + " not palindrome.");

	}
}