package interfaces;

public class AdultUsers implements LibraryUser {
	
	private int age;
	private String bookType;
	public AdultUsers(int age , String bookType) {
		this.age = age ;
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		
		if(age >= 12) {
			System.out.println("you ar registered as an adult so behave like one !! ");
			
		}
		else 
		{
			System.out.println("Sorry Kid age must be above 12 to be registered as an adult !!");
		}
		
	}
	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		;
		if(bookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book must be returnd in 7 days any longer there will a case !!");
		}
		else {
			System.out.println("only alowed adult fiction books , growup mann !!");
		}
		
	}


	

}
