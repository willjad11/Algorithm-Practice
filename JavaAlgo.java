import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class JavaAlgo {

    public static void main(String[] args) {
        // You are asked to square every digit of a number and concatenate them
        // For example, if we run 9119 through the function, 811181 will come out,
        // because 9^2 is 81 and 1^2 is 1.
        class SquareDigit {
            public int squareDigits(int n) {
                String output = "";
                String numberString = Integer.toString(n);
                for (int i = 0; i < numberString.length(); i++) {
                    output += Character.getNumericValue(numberString.charAt(i)) *  Character.getNumericValue(numberString.charAt(i)); 
                }
                return Integer.parseInt(output);
            }
        }
        // SquareDigit squareDigit = new SquareDigit();
        // squareDigit.squareDigits(12345);

        // -------------------------------------------------------------------------------------------

        // Return the number (count) of vowels in the given string.
        // We will consider a, e, i, o, u as vowels but not y.
        // The input string will only consist of lower case letters and/or spaces.

        class Vowels {
            public int getCount(String str) {
                int vowelsCount = 0;
                String[] vowels = { "a", "e", "i", "o", "u" };
                for (int i = 0; i < str.length(); i++) {
                    if (Arrays.asList(vowels).contains(Character.toString(str.charAt(i)))) {
                        vowelsCount += 1;
                    }
                }
                return vowelsCount;
            }
        }
        // Vowels vowels = new Vowels();
        // vowels.getCount("aeiou");

        // -------------------------------------------------------------------------------------------

        // create a fibonacci function that given a signature array/list, returns the first n elements 
        // signature included of the so seeded sequence
        // it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the 
        // sequence to generate the next

        class Xbonacci {
            public double[] tribonacci(double[] s, int n) {
                double[] output = new double[n];
                for (int i = 0; i < n; i++) {
                    if (i < 3) {
                        output[i] = s[i];
                    }
                    else {
                        output[i] = output[i - 1] + output[i - 2] + output[i - 3];
                    }
                }
                return output;
            }
        }
        // Xbonacci xbonacci = new Xbonacci();
        // xbonacci.tribonacci(new double []{1,1,1},10);
    }
}


