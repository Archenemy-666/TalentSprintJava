package interfaces;

public interface Shapes {
	float pi = 3.14f ;
	
	public double area( );
	public double perimeter();
	
	public static void details() {
		System.out.println("shape details");
	}
}
