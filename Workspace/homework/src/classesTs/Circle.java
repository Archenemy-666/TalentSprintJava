package classesTs;

public class Circle { 
	double radius ;
	double boundryLen() {
		return 2 * 3.14 * radius ;
	}
	double area() {
		return 3.14 * Math.pow(radius, 2); 
	}
	public String toString() {
		return "radius "+radius+" area : "+ area()+" perimeter :  "+boundryLen() ;  
	}

}
