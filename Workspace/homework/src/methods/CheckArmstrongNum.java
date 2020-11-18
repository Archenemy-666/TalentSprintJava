package methods;

public class CheckArmstrongNum {
	public static int noOfDigits(int num){
	int count = 0 ;	
		while(num!= 0) {
			num/=10;
			count++;
		}
		return count;
	}
	public static boolean ArmstrongNumCheck(int num) {
		int sum = 0;
		int originalNum = num;
		while (num != 0) {
			int rem = num % 10;
			sum += Math.pow(rem,noOfDigits(originalNum));
			num /= 10;
		}
		if (sum == originalNum) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(ArmstrongNumCheck(1));
	}

}
