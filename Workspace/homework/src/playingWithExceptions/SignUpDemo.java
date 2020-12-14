package playingWithExceptions;
import java.util.Scanner;
import  userDefinedExceptions.*;
public class SignUpDemo  {
	public static void main(String[] args) throws PasswordException {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter userId : ");
		String userId = scan.nextLine();
		System.out.println("enter password : ");
		String password = scan.nextLine();
		
		if(password.isEmpty()) {
			try {
				throw new PasswordException("fill in the password ");
			}
			catch(PasswordException e){
				e.printStackTrace();
				
			}
			
		}
		
		
			
		
	System.out.println("userId "+userId);
	}
	

}
