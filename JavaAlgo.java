import java.util.Arrays;

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
    }
}


