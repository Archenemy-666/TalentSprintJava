package methods;

import java.util.Scanner;

public class PerimeterOfRectangle {
	public static double perimeterRect(double l, double b) {
		double perimeter = 2 * (l + b);
		return perimeter;
	}
	
	public static double areaRect(double l, double b) {
		double area = l*b;
		return area;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter length and breadth of rectangle");
		double len = scan.nextDouble();
		double breadth = scan.nextDouble();
		System.out.println("perimeter : " + perimeterRect(len, breadth)+ " area is : "+areaRect(len,breadth));

	}

}
