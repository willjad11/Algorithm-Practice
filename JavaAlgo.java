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
        SquareDigit squareDigit = new SquareDigit();
        squareDigit.squareDigits(12345);
    }
}


