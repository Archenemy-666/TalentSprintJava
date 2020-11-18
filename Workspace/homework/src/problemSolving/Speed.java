// - Write a Java program to takes the user for a distance 
// (in meters) and the time was taken in format hh:mm:ss, 
// Calculate and display the speed, in meters per second, 
// kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

//Input : Distance = 540524 , Time = 12:30:20 (String)




package problemSolving;

import java.util.Scanner;

public class Speed {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter distance in meters : ");
		float distanceInMeteres = sc.nextFloat();	
		
		float miles = distanceInMeteres/1609 ;
		
		float km = distanceInMeteres/1000 ;

		String s1 = "12:23:33";
		String[] values = s1.split(":");




		int hours = Integer.parseInt(values[0]);
		int min = Integer.parseInt(values[1]);
		int sec = Integer.parseInt(values[2]);
		
		
	
		float totalTimeToSec = (hours * 3600) + (min * 60) + sec ;
		float totalTimeToH = (totalTimeToSec / 3600) ; 
		
		float speedInMts = distanceInMeteres/totalTimeToSec ; 
		
		float speedInKmh = km/totalTimeToH ;
		
		float speedInMh = miles/totalTimeToH ;


		System.out.println("speed in meters per sec "+speedInMts);
  		System.out.println("speed in miles per hour "+speedInMh);
		System.out.println("speed in km per hour "+speedInKmh);
	}

}
