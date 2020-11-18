package interfaces;

public class Rectangle implements Shapes {
	private int length ;
	private int bredth ;
	
	public Rectangle() {}
	
	public Rectangle(int length , int bredth) {
		this.length = length ; 
		this.bredth = bredth ;
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * bredth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * ( length + bredth);
	}
	

}
