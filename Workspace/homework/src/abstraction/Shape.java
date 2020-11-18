package abstraction;

public abstract class Shape {
	
	private String color ; 
	
	Shape(){}
	Shape(String color){
		this.color = color ;
	}
	
	// abstract methods 
	
	abstract double area();
	abstract double perimeter();
	
	

}
