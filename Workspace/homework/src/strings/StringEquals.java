package strings;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "mello";
		String s3 = "Doday is dhe besd day of dhe resd of my life." ;
		System.out.println(equals(s1,s2));
		System.out.println(upper(s1));
		System.out.println(count(s3));
		System.out.println(replace(s3,"d","t"));
		
		
	}
	public static boolean equals(String a , String b ) {
		if(a.trim().equals(b.trim()))
			return true ;
		else 
			return false ;
	}
	public static String upper(String a ) {
		return a.toUpperCase() ;
	}
	public static int count(String a ) {
		String [] words = a.split(" ");
		return words.length;
	}
	public static String replace(String a ,String b , String c) {
		String changed = a.replaceAll(b,c);
		return changed ;
	}

}
