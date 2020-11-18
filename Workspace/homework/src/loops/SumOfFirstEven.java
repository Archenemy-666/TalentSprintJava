package loops;

import java.util.*;

public class SumOfFirstEven {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter right limit :");
		int limit = scan.nextInt();

		int sum = 0;
		for (int i = 0; i <= limit; i = i + 2) {

			sum += i;
		}
		System.out.println(sum);

	}

}
