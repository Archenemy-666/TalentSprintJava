package homework_beginner;

import java.util.* ;
public class temperature 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value in farenheit");
		float fareheit = scan.nextFloat();
		float celcius = (fareheit - 32) * 5/9;
		System.out.println("temperature in celcius : "+celcius);
	}
	
	
	

}
