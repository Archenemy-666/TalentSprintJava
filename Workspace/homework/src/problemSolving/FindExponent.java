package problemSolving;

public class FindExponent {
	public static void main(String[] args) {
		int x = 8;  
		int x1 = 64;
		System.out.println(findingExp(x,x1));
	

	}
	public static int findExp(int x, int x1) {
	
		for(int i = 0 ; i < x1/2 ; i++) {
			if(Math.pow(x,i) == x1) {
				return i;
		
			}
			
		}
		return -1;
	}
	
	// better version 
	public static double findingExp(double base , double num) {
		double exp = Math.log10(num) / Math.log10(base);
		if(Math.ceil(exp) == Math.floor(exp)){
			return exp;
			
		}
		return -1;
	}
	
}

