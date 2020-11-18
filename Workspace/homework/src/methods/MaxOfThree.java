package methods;

import java.util.Scanner;

public class MaxOfThree {
	public static int compareThreeNum(int num1, int num2, int num3) {
		int max = num1;
		if (num2 > max) {
			max = num2;
		
		}  if(num3 > max) {
			max = num3;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 numbers to compare");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		System.out.println("the hisghest number among the inputs is  : " + compareThreeNum(num1, num2, num3));

	}

}
