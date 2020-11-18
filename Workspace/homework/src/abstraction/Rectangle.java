package abstraction;

public class Rectangle extends Shape {
	private double length;
	private double bredth ;
	
	Rectangle(){}
	Rectangle(String color, double length , double bredth ){
		super(color) ;
		this.length = length ;
		
		
	}
	
	@Override
	public double area() {
		return  length * bredth ;
	}
	@Override
	public double perimeter() {
		return 2 * (length + bredth) ;
		
	}

}
