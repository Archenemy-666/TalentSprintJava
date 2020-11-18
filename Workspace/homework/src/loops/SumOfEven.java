package loops;

import java.util.*;

public class SumOfEven {
	public static void main(String[] args) {
		int start = 1;
		int end = 5;
		int sum = 0;
		while (start < end) {
			start++;
			if (start % 2 == 0) {
				
				sum = sum + start;
			}

		}
		System.out.println(sum);

	}

}
