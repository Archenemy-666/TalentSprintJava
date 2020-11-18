package methods;

public class EvenOddCheckOfDigits {
	public static boolean evenOddCheck(int num) {
	    int even_count = 0; 
	    int odd_count = 0; 
	    while (num > 0)  
	    { 
	        int rem = num % 10; 
	        if (rem % 2 == 0) 
	        	even_count++ ;
	        else
	            odd_count++; 
	        num = num / 10; 
	    }
	    if(even_count > 0) {
	    	return false;
	    }
	    else {
	    	return true;
	    }
	    
	}
	public static void main(String[] args) {
		System.out.println(evenOddCheck(2));
	}

}
