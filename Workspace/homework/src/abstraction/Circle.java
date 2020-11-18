package abstraction;

public   class Circle extends Shape {
	private double radius;
	
	Circle(){}
	Circle(String color, double radius ){
		super(color) ;
		this.radius = radius ;
		
	}
	
	@Override
	public double area() {
		return 3.14 * radius * radius ;
	}
	@Override
	public double perimeter() {
		return 2 * 3.14 * radius ;
		
	}

	

}
