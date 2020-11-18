package interfaces;

import java.util.Scanner;

public class CalculateBillAmount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("WBill or EBill");
		String Choice = scan.next();
		
		if( Choice.equalsIgnoreCase("WBill")) {
			WBill water = new WBill();
			System.out.println("enter no_of_units Water bill");
			int no_of_units = scan.nextInt();
			
			System.out.println("enter cost_per_unit water bill");
			double cost_per_unit = scan.nextDouble();
			
			water.calcBill(no_of_units, cost_per_unit) ;
			water.displayBill();
		}
		else if(Choice.equalsIgnoreCase("EBill")){
			EBill electricity = new EBill();
			System.out.println("enter no_of_units electricity bill");
			int no_of_unitse = scan.nextInt();
			
			System.out.println("enter cost_per_unit electricity bill");
			double cost_per_unitse = scan.nextDouble();
			
			electricity.calcBill(no_of_unitse, cost_per_unitse);
			electricity.displayBill();
			
		}
		else {
			System.out.println("invalid input ");
		}
		
		
		
		
		
		
		
		//water bill 

		
		
		// electricity bill

		
		
	}
	

}
