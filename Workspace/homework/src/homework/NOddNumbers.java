package homework;

import java.util.Scanner;

public class NOddNumbers {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the count  of odd numbers considered in  sequence :");
		int limit = scan.nextInt();

		int count = 0;
		int sum = 0;

		for (int i = 1; count <= limit; i = i + 2) {

			sum += i;
			count++;
		}
		System.out.println(sum);

	}

}
