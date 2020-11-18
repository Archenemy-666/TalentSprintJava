package loops;

import java.util.*;

public class SumOfNaturalNo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter right limit :");
		int limit = scan.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= limit; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
