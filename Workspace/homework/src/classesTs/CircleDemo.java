package classesTs;

import java.util.Scanner;

public class CircleDemo {
	public static void main(String[] args) {
		
		
		Circle circle1 = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius : ");
		circle1.radius = scan.nextInt();
		
		//System.out.println("area : "+circle1.area());
		//System.out.println("circumference : "+circle1.boundryLen());
		System.out.println(circle1);
	}
}
