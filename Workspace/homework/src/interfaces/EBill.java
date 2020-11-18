package interfaces;

public class EBill implements Bill  {
	private double amount ;
	@Override
	public double calcBill(int no_of_unit, double cost_per_unit) {
		// TODO Auto-generated method stub
		amount = no_of_unit * cost_per_unit ;
		return amount ;
		
	}

	@Override
	public void displayBill() {
		// TODO Auto-generated method stub
		System.out.println(amount);
		
	}

}
