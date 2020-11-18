package homework;

import java.util.*;

public class AttendenceCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter no of days attended out of 120");
		float present = scan.nextFloat();

		int semester = 120;

		float attendPercentage = (present / semester) * 100;

		if (attendPercentage >= 75) {
			System.out.println(attendPercentage + " %  allowed to write the test ");
		} else {
			System.out.println(attendPercentage + " %  get out you filth");
		}

	}

}
