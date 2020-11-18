package problemSolving;

import java.util.Scanner;

public class Anagrams {
	public static boolean isAnagram(String a , String b) {
		a = a.replaceAll("\\s", "");
        b = b.replaceAll("\\s", "");
        int lena = a.length();
        int lenb = b.length();
        
        if(lena == lenb ){
            char[] A = a.toLowerCase().toCharArray();
            char[] B = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(A);
            java.util.Arrays.sort(B);
            return(java.util.Arrays.equals(A,B));
        }
        else {
        return false;
        }
    }
	
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        System.out.println("String a");
        String a = scan.next();
        System.out.println("String b");
        String b = scan.next();
        System.out.println(isAnagram(a, b));
    }
	}

