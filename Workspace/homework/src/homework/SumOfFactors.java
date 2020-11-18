package homework;

import java.util.Scanner;

public class SumOfFactors {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = scan.nextInt();
		int sum = num + 1;
		for (int i = 2; i <= num/2; i++) {
			
			if (num % i == 0) {
				sum = sum + i;
				
		}
			
		}
		System.out.println(sum);

	}
}
