package Arrays;

public class SumOfCubes {
	public static int[] toCubes(int array[], int len) {
		int num = 0;
		for (int index = 0; index < len; index++) {
			num = (int) Math.pow(array[index], 3);
			array[index] = num;
		}
		return array;
	}

	public static int maxInArray(int array[], int len) {
		int[] cubeArray = toCubes(array, len);
		int max = cubeArray[0];
		for (int index = 1; index < len; index++) {
			if (cubeArray[index] > max) {
				max = cubeArray[index];
			}

		}
		return max;
	}

public static int sumOfArray(int array[], int len) {
	int sum = 0;
	int[] cubeArray = toCubes(array, len);
	for (int index = 0; index < len; index++) {
		sum += cubeArray[index];
	}
	return sum;
}

public static void main(String[] args) {
	int array[] = { 2, 1, 1, 1, 3 };
	int len = array.length;
	System.out.println(sumOfArray(array, len));
	System.out.println(maxInArray(array, len));

}
}
