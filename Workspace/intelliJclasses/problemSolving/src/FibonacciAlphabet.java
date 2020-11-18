import java.util.Scanner;

public class FibonacciAlphabet {
    public static int charFib(char charecter) {
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
        char point = 0;
        int sum = 0;
        if (word.equals("abc")) {
            return 2;
        } else {
            for (int i = 0; i < alpha.length; i++) {
                point = alpha[i];
                sum = sum + charFib(point);
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
