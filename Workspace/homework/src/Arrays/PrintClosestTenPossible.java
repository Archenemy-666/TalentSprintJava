package Arrays;

public class PrintClosestTenPossible {
	public static int[] buildTenMultiplesArray(int[] array, int length) {

		int num, nextNum;
		// int tenMultiples[] = new int[length];
		for (int index = 0; index < length; index++) {
			num = array[index];
			if (num % 10 == 0) {
				// tenMultiples[index] = num;
				array[index] = num;

			} else {
				nextNum = (10 - (num % 10)) + num;
				// tenMultiples[index] = nextNum;
				array[index] = nextNum;
			}

		}
		return array;
		// return tenMultiples;
	}

	public static void main(String[] args) {
		int array[] = { 111, 2, 4, 5, 12 };

		int length = array.length;
		int arrayOfTenMultiples[] = buildTenMultiplesArray(array, length);

		for (int i = 0; i < arrayOfTenMultiples.length; i++) {
			System.out.print(arrayOfTenMultiples[i] + ",");
		}
	}
}
