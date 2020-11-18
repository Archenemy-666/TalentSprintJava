package homework;

import java.util.*;

public class CollinearCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the 1st point coordinates ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();

		System.out.println("enter the 2nd point coordinates ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();

		System.out.println("enter the 3rd point coordinates ");
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();

		if (((y3 - y2) * (x2 - x1) == (y2 - y1) * (x3 - x2))) {
			System.out.println("collinear");
		} else {
			System.out.println("non- collinear");
		}

	}

}
