package problemSolving;

import java.util.Scanner;

public class NextPallindrome {
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
	
	public static int nextnum(int num) {
		while ((isPallindrome(num)) == false ) {
			num = num + 1;
		}
		return(num);
	}
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		System.out.println(nextnum(num));
		 

		}
}


