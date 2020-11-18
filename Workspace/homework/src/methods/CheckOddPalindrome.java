package methods;

import java.util.Scanner;

public class CheckOddPalindrome {
	public static boolean oddDigitCheck(int num) {
		
		while (num != 0) {
			int digit = num % 10;
			num /= 10;
			if (digit % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkPallindrome(int num) {
		int reversedInt = 0;
		int originalInt = num;
		
		while (num != 0) {
			int rem = num % 10;
			reversedInt = (reversedInt * 10) + rem;
			num /= 10;
		}
		if (reversedInt == originalInt) {
			return true;
		} else {
			return false;
		}

	}

	public static void CheckOddPallindrome(int num) {
		
		if (oddDigitCheck(num) && checkPallindrome(num)) {
			System.out.println("Number is OddPallindrome");
			
		} 
		else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter number to be checked for OddPalindrome");
		int num = scan.nextInt();

		CheckOddPallindrome(num);
	}
}
