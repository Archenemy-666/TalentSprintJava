package methods;

public class SearchNumIn1DArray {
	public static boolean search(int[] arr , int searchNum) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == searchNum) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int []arr = {1,5,12,33};
		int searchNum = 33 ; 
		System.out.println(search(arr,searchNum));
	}
}
