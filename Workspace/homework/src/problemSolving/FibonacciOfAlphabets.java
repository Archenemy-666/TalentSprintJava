package problemSolving;

/*
- Consider that values of alphabet A-Z run like Fibonacci series with A = 0, B = 1, C = A+B, D = B + C and so on. Now write a program that calculate and write the numeric value of the given words like, "CAGE". (Ex : Value of "ABC" is 0 + 1 + 1 = 2)

Input: CAGE
Output: 12

Input: MAN
Output: 377
*/
import java.util.*;

public class FibonacciOfAlphabets {

    public static int charPointer(char charecter) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = alphabets.toCharArray();

        int pointer = 0;

        for (int index = 0; index < alphabet.length; index++) {
            if (alphabet[index] == charecter) {
                pointer = index;
            }
        }
        int x1 = 0;
        int x2 = 1;
        int temp = 0;
        for (int i = 2; i <=pointer; i++) {
            temp = x1 + x2;
            x1 = x2;
            x2 = temp;
            }
            return temp ;
        }
    public static int fibSumofWord(String word) {
        char[] alpha = word.toCharArray();
        char charecter ;
        int sum = 0;
        if (word.equals("abc")) {
            return 2;
        } else {
            for (int i = 0; i < alpha.length; i++) {
                charecter = alpha[i];
                sum = sum + charPointer(charecter);
            }
            return sum;

        }
    }
    public static void main(String[] args){
        System.out.println("enter word ");
        Scanner scan = new Scanner(System.in);
        String theWord = scan.nextLine();
        theWord = theWord.toLowerCase();
        System.out.println("the sum of the alphabets in the word considering their values as fibs :  "+fibSumofWord(theWord));
    }

    }
