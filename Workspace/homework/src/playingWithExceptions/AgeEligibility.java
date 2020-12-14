package playingWithExceptions;
import java.util.Scanner;

import userDefinedExceptions.AgeInvalidException;
public class AgeEligibility {
	public static void main(String[] args) throws AgeInvalidException{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("age");
		int age = scan.nextInt();
		if(age < 18) {
		try {
			throw new AgeInvalidException("Invalid Age "+age);
			
		}
		catch(AgeInvalidException e){
			e.printStackTrace();
			
		}
		}
		
	}

}
