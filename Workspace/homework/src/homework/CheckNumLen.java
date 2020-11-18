package homework;

import java.util.*;

public class CheckNumLen {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter number : ");
		int number = scan.nextInt();

		int temp = 1;
		int length = 0;
		while (temp <= number) {
			length++;
			temp = temp * 10;

		}
		System.out.println("the len of digit is : " + length);
		if (length == 5) {
			System.out.println("length os 5");
		} else {
			System.out.println("len not 5");
		}

	}

}
