import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        // -------------------------------------------------------------------------------------------

        // Implement a function that accepts 3 integer values a, b, c. The function should return true 
        // if a triangle can be built with the sides of given length and false in any other case.

        class TriangleTester {
            public boolean isTriangle(int a, int b, int c) {
                return (a < b + c && b < a + c && c < a + b);
            }
        }
        // TriangleTester triangleTester = new TriangleTester();
        // System.out.println(triangleTester.isTriangle(1, 2, 2));

        // -------------------------------------------------------------------------------------------

        // Your job is to take that array and find an index N where the sum of the integers to the left of 
        // N is equal to the sum of the integers to the right of N. If there is no index that would make 
        // this happen, return -1.

        class EvenIndex {
            public int findEvenIndex(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    int arrayLeft = IntStream.of(Arrays.copyOfRange(arr, 0, i)).sum();
                    int arrayRight = IntStream.of(Arrays.copyOfRange(arr, i + 1, arr.length)).sum();
                    if (arrayLeft == arrayRight) {
                        return i;
                    }
                }
                return -1;
            }
        }
        // EvenIndex evenIndex = new EvenIndex();
        // System.out.println(evenIndex.findEvenIndex(new int[] { 1, 100, 50, -51, 1, 1}));

        // -------------------------------------------------------------------------------------------

        // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
        // The sum of these multiples is 23. Create a function that returns the sum of all the 
        // multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0.

        class Solution {
            public int solution(int number) {
                int sum = 0;
                for (int i = number - 1; i >= 0; i--) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        sum += i;
                    }
                    else if (i % 3 == 0 || i % 5 == 0) {
                        sum += i;
                    }
                }
                return sum;
            }
        }
        // Solution solution = new Solution();
        // System.out.println(solution.solution(10));

        // -------------------------------------------------------------------------------------------

        // You probably know the "like" system from Facebook and other pages. People can "like" blog posts, 
        // pictures or other items. We want to create the text that should be displayed next to such an item.
        // Implement the function which takes an array containing the names of people that like an item.

        class WhoLikesIt {
            public String whoLikesIt(String... names) {
                if (names.length == 0) {
                    return "no one likes this";
                }
                if (names.length == 1) {
                    return names[0] + " likes this";
                }
                if (names.length == 2) {
                    return names[0] + " and " + names[1] + " like this";
                }
                if (names.length == 3) {
                    return names[0] + ", " + names[1] + " and " + names[2] + " like this";
                }
                if (names.length >= 4) {
                    return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                }
                return "";
            }
        }
        // WhoLikesIt whoLikesIt = new WhoLikesIt();
        // System.out.println(whoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));

        // -------------------------------------------------------------------------------------------

        // Write a function that accepts an array of one-letter strings representing
        // directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single
        // block for each letter (direction) and you know it takes you one minute to
        // traverse one city block, so create a function that will return true if the
        // walk the app gives you will take you exactly ten minutes (you don't want to
        // be early or late!) and will, of course, return you to your starting point.
        // Return false otherwise.

        class TenMinWalk {
            public boolean isValid(char[] walk) {
                int xAxis = 0;
                int yAxis = 0;
                if (walk.length != 10) {
                    return false;
                }
                for (int i = 0; i < walk.length; i++) {
                    if (walk[i] == 'n') {
                        yAxis++;
                    }
                    if (walk[i] == 's') {
                        yAxis--;
                    }
                    if (walk[i] == 'w') {
                        xAxis++;
                    }
                    if (walk[i] == 'e') {
                        xAxis--;
                    }
                }
                if (xAxis == 0 && yAxis == 0) {
                    return true;
                }
                return false;
            }
        }
        // TenMinWalk tenMinWalk = new TenMinWalk();
        // System.out.println(tenMinWalk.isValid(new char[] {'n','n','n','w','w','e','n','s','n','s'}));

        // -------------------------------------------------------------------------------------------

        // Build a pyramid-shaped tower given a positive integer number of floors. A tower block is 
        // represented with "*" character.

        class Tower {
            public String[] TowerBuilder(int nFloors) {
                String[] pyramid = new String[nFloors];
                int spaces = nFloors - 1;
                int asterisks = 1;
                for (int i = 0; i < nFloors; i++) {
                    String tempString = "";
                    tempString += String.join("", Collections.nCopies(spaces, " "))
                            + String.join("", Collections.nCopies(asterisks, "*"))
                            + String.join("", Collections.nCopies(spaces, " "));
                    pyramid[i] = tempString;
                    spaces -= 1;
                    if (spaces < 0) {
                        spaces = 0;
                    }
                    asterisks += 2;
                }
                return pyramid;
            }
        }
        // Tower tower = new Tower();
        // Arrays.asList(tower.TowerBuilder(10)).forEach(e -> System.out.println(e));

        // -------------------------------------------------------------------------------------------

        // The goal of this exercise is to convert a string to a new string where each character in the 
        // new string is "(" if that character appears only once in the original string, or ")" if that 
        // character appears more than once in the original string. Ignore capitalization when determining 
        // if a character is a duplicate.

        class DuplicateEncoder {
            String encode(String word) {
                String output = "";
                for (int i = 0; i < word.length(); i++) {
                    String escape = "";
                    if (!Character.isLetter(word.charAt(i)) && !Character.isDigit(word.charAt(i))) {
                        escape = "\\";
                    }
                    if (word.toLowerCase().split(escape + Character.toString(word.charAt(i)).toLowerCase(), -1).length - 1 > 1) {
                        output += ")";
                        escape = "";
                    }
                    else {
                        output += "(";
                        escape = "";
                    }
                }
                return output;
            }
        }
        // DuplicateEncoder duplicateEncoder = new DuplicateEncoder();
        // System.out.println(duplicateEncoder.encode("Prespecialized"));
    }
}


