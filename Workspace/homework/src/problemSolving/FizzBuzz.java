package problemSolving;
// if 3 fizz if 5 buzz if both fizzbuzz

public class FizzBuzz {
	public static void main(String[] args) {
		int end =  100 ;
		for ( int i = 0 ; i <= 100 ; i ++ ) {
			String res = "";
			if(i%3 == 0){
				res += "fizz" ;
				System.out.println(res);
			}
			if(i % 5 == 0) {
				res += " buzz";
				System.out.println(res);
			}
			if(res.length() == 0) {
				System.out.println(i);
			}
	
		}
		
		
	}
	

}
