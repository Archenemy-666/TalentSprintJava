package loops;

import java.util.Scanner;

public class SumofNEvenNaturalNum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the count of evens :");
		int limit = scan.nextInt();
		
		int count = 0;
		int sum = 0;
		
		for (int i = 0; count <= limit; i = i + 2) {

			sum += i;
			count++;
		}
		System.out.println(sum);

	}

}
