
import java.util.ArrayList;

public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that
     * returns the factorial of a given number n.
     */
    public static int factorial(int n) {
        int answer = 1;
        for (int i = n; i > 0; i--) {
            answer = answer * i;
        }
        return answer;
    }

    public static int factorialRecursive(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int answer = factorialRecursive(n - 1);
        return n * answer;
    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive
     * method that returns the nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0, 0);
        a.add(1, 1);
        for (int i = 2; i < n + 1; i++) {
            a.add(i, a.get(i - 1) + a.get(i - 2));
        }
        return a.get(a.size() - 1);
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int answer = fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        return answer;
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method
     * that returns the sum of the digits of a given integer.
     */
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; n > 10; i++) {
            a.add(i, n % 10);
            n = n / 10;
        }
        int answer = 0;
        for (int i = 0; i < a.size(); i++) {
            answer = answer + a.get(i);
        }
        return answer + n;
    }

    public static int sumDigitsRecursive(int n) {
        if (n < 10) {
            return n;
        }
        int answer = sumDigitsRecursive(n / 10) + n % 10;
        return answer;
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that
     * returns the count of occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String a = "" + str.charAt(i);
            if (a.equals("x") == true) {
                count++;
            }
        }
        return count;
    }

    public static int countXRecursive(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        if (str.charAt(0) == 'x') {
            count++;
        }
        return count + countXRecursive(str.substring(1));
    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method
     * that returns the reverse of a given string.
     */
    public static String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        }

        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = "" + str.charAt(i);
        }

        String[] newArray = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            newArray[i] = arr[arr.length - i - 1];
        }

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            answer = answer + newArray[i];
        }
        return answer;
    }

    public static String reverseStringRecursive(String str) {
        if (str.length() == 0) {
            return "";
        }
        return str.charAt(str.length() - 1) + reverseStringRecursive(str.substring(0, str.length() - 1));
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method
     * that calculates and returns the value of base raised to the power of
     * exponent.
     */
    public static int power(int base, int exponent) {
        return 0;
    }

    public static int powerRecursive(int base, int exponent) {
        return 0;
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive
     * method that checks whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {

        return false;
    }

    public static boolean isPalindromeRecursive(String str) {
        return false;
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and
     * non-recursive method that finds and returns the greatest common divisor
     * of two numbers.
     */
    public static int gcd(int a, int b) {
        return 0;
    }

    public static int gcdRecursive(int a, int b) {
        return 0;
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1,
     * 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even
     * bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised
     * foot. Recursively return the number of "ears" in the bunny line 1, 2, ...
     * n (without loops or multiplication).
     */
    public static int bunnyEars(int bunnies) {
        return 0;

    }

    public static int bunnyEarsRecursive(int bunnies) {
        return 0;
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method
     * that implements the binary search algorithm to find and return the index
     * of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {

        return -1; // Element not found
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        return -1;
    }

    // DO NOT EDIT! Work on the helper version above this method. This method is to be used for testing purposes only.
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1); // Element not found
    }

}
