package loops;

import java.util.*;

public class FactOfNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int count = num ;
		int fact = 1;
		while(count != 0 ) {
			fact = fact*count;
			count--;
		}
		System.out.println(fact);
	}
}
