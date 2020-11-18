package Arrays;

import java.util.Scanner;

public class StoringDigitsOfNumberInAray {
	public static int lengthOfNum(int num) {
		int count = 0;
		while(num!=0) {
			count++;
			num/= 10;
			
		}
		return count;
		
		
	}
	public static int[] digitsOfNumber(int num) {
		int digit = 0;
		int lengthOfNum = lengthOfNum(num);
		int index = lengthOfNum - 1;
		int[] digits = new int[lengthOfNum(num)] ; 
		while(num!=0) {
			digit = num % 10 ;
			digits[index] = digit;
			index--;
			num/=10;
		}

		return digits;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int digits[] = digitsOfNumber(num);
				
		for(int i = 0 ; i<digits.length;i++) {
		System.out.print(digits[i]+",");
		}
		
	}
}
