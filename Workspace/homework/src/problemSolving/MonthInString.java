package problemSolving;

import java.util.Scanner;

public class MonthInString {
	public static int findMonthNum(String month) {
		String[] months = {"january", "febuary" , " march" , "april" , "may" , "june" , "july" , "august" , "september" ,"october" , "november" , "december"};
		month = month.toLowerCase();
		for ( int i = 0 ; i < (months.length) ; i++ ) {
			if (months[i].equals(month)) {
				return i+1 ;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("enter month : ");
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		System.out.println(findMonthNum(month));
	}

}
