package Arrays;

public class OddEvenCount {
	public static int[] evenOddCount(int[] array, int len) {
		int num, evenCount = 0, oddCount = 0;
		int[] countArray = new int[2];
		for (int index = 0; index < len; index++) {
			num = array[index];
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		countArray[0] = evenCount;
		countArray[1] = oddCount;

		return countArray;
	}

	public static void main(String[] args) {
		int[] arrays = { 1, 4, 3, 5, 3 };
		int len = arrays.length;
		int[] count = evenOddCount(arrays, len);
		System.out.println("even count : " + count[0]);
		System.out.println("Odd count : " + count[1]);
	}

}
