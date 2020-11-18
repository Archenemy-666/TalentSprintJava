package methods;

//fibonacci series if it were the sum of 3 integers 


public class FibonacciSeriesN {
	public static String fibonacciCal(int count) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3 ;
		String value = "";
		value += (num1+" "+num2+" "+num3+" ");
		
		for (int i = 2; i < count; ++i) {
			int num4 = num1 + num2 + num3 ;
			value += (num4 + " ");

			num1 = num2;
			num2 = num3;
			num3 = num4;
		}
		return value;
	}

	public static void main(String[] args) {
		int x = 4;
		String value = fibonacciCal(x);
		String[] valList =  value.split(" ");
		System.out.println(value);
		System.out.println(valList[x]);
	}

}
