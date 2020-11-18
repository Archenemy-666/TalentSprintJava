package interfaces;

public class circle implements Shapes {
    private	double radius ;
    
    public circle() {}
    
    public circle(double radius) {
    	this.radius = radius ;
    }
    
    
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * radius * radius ;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * pi * radius;
		
	}
	public static void details() {
		System.out.println("circle details");
	}

}
