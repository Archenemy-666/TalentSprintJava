package homework;
import java.util.*;

public class SignOfNumbers {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("enter any integer");
			int num1 = scan.nextInt();
			
			if (num1 > 0)
				System.out.println("positive integer");
			else if (num1 < 0)
				System.out.println("negative integer");
			else 
				System.out.println("zero");
	}

}
