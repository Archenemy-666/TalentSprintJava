package loops;

import java.util.*;

public class SumOfRange {
	public static void main(String[] args) {

		int i = 0;
		int sum = 0;
		int num = 200;

		while (i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}
