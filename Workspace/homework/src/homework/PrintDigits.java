package homework;

public class PrintDigits {
	public static void main(String[] args) {
		int num = 123455;
		int sum = 0;
		int count = 0;
		while (num != 0) {
			sum = num % 10;
			System.out.println(sum);
			num = num / 10;
			
		}
	}

}
