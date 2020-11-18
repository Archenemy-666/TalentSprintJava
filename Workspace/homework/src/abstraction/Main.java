package abstraction;

public class Main {
	public static void main (String [] args ) {
		Circle c1 = new Circle("blue" , 12.2);
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
	}

}
