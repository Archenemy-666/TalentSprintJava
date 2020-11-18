package homework;

import java.util.*;

public class DiscountCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the price : ");
		double realPrice = scan.nextDouble();

		if (realPrice >= 20000)
		{
			double discountPercent = 25;
			double discount = (discountPercent / 100) * realPrice;
			double priceAfterDiscount = realPrice - discount;

			System.out.println("amount reduced :" + discount);
			System.out.println("price after discoun : " + priceAfterDiscount);

		} 
		else if (realPrice >= 10000) 
		{
			double discountPercent = 20;
			double discount = (discountPercent / 100) * realPrice;
			double priceAfterDiscount = realPrice - discount;

			System.out.println("amount reduced :" + discount);
			System.out.println("price after discount : " + priceAfterDiscount);
		}
		else if (realPrice > 0) 
		{
			double discountPercent = 10;
			double discount = (discountPercent / 100) * realPrice;
			double priceAfterDiscount = realPrice - discount;

			System.out.println("amount reduced :" + discount);
			System.out.println("price after discoun : " + priceAfterDiscount);
		} 
		else 
		{
			System.out.println("enter valid price please");
		}
	}

}
