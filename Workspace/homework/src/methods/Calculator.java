package methods;

import java.util.*;

public class Calculator {
	public static Double add(double x, double y) {
		double sum = x + y;
		return sum;
	}

	public static Double subtract(double x, double y) {
		double sub = x - y;
		return sub;
	}

	public static Double div(double x, double y) {
		double div = x / y;
		return div;
	}

	public static Double mul(double x, double y) {
		double mul = x * y;
		return mul;
	}

	public static Double reminder(double x, double y) {
		double rem = x % y;
		return rem;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter first value");
		double i = scan.nextDouble();

		System.out.println("enter second value");
		double j = scan.nextDouble();

		System.out.println("enter your choice according to this keys ");
		System.out.println("1 .add");
		System.out.println("2. sub ");
		System.out.println("3. div ");
		System.out.println("4. mul ");
		System.out.println("5. rem");

		int choice = scan.nextInt();

		if (choice == 1) {
			double sum = add(i, j);
			System.out.println("sum is " + sum);
		}

		else if (choice == 2) {
			double sub = subtract(i, j);
			System.out.println("sub is " + sub);
		}

		else if (choice == 3) {
			double div = div(i, j);
			System.out.println("div is " + div);
		}

		else if (choice == 4) {
			double mul = mul(i, j);
			System.out.println("mul is " + mul);
		}

		else if (choice == 5) {
			double rem = reminder(i, j);
			System.out.println("rem is " + rem);
		}

		else {
			System.out.println("wrong command");
		}

	}

}
