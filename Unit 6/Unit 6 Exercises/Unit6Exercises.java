
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
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            answer = answer + str.charAt(i);
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
        if (exponent == 0) {
            return 1;
        }
        int answer = base;
        for (int i = 1; i < exponent; i++) {
            answer = answer * base;
        }
        return answer;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        return powerRecursive(base, exponent - 1) * base;
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive
     * method that checks whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        if (str.length() == 0) {
            return true;
        }
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return str.equals(s);
        // return reverseString(str).equals(str);

    }

    public static boolean isPalindromeRecursive(String str) {
        if (str.length() == 0) {
            return true;
        }
        return reverseStringRecursive(str).equals(str);
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and
     * non-recursive method that finds and returns the greatest common divisor
     * of two numbers.
     */
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        int gcd = 1;
        int small = a;
        int big = b;
        if (a > b) {
            small = b;
            big = a;
        }
        for (int i = 1; i <= small; i++) {
            if (small % i == 0 && big % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcdRecursive(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        if (a == 1 || b == 1) {
            return 1;
        }
        int small = a;
        if (b < a) {
            small = b;
        }
        for (int i = 2; i <= small; i++) {
            if (a % i == 0 && b % i == 0) {
                return i * gcdRecursive(a / i, b / i);
            }
        }
        return 1;
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1,
     * 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even
     * bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised
     * foot. Recursively return the number of "ears" in the bunny line 1, 2, ...
     * n (without loops or multiplication).
     */
    public static int bunnyEars(int bunnies) {
        if (bunnies % 2 == 0) {
            return (int) (bunnies * 2.5);
        } else {
            return (int) ((bunnies - 1) * 2.5 + 2);
        }
    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return bunnyEarsRecursive(bunnies - 1) + 3;
        } else {
            return bunnyEarsRecursive(bunnies - 1) + 2;
        }
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method
     * that implements the binary search algorithm to find and return the index
     * of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int halfway = (high + low) / 2;
            if (arr[halfway] > key) {
                high = halfway - 1;
            } else if (arr[halfway] < key) {
                low = halfway + 1;
            } else {
                return halfway;
            }
        }
        return -1; // Element not found
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        int halfway = (high + low) / 2;
        if (high < low) {
            return -1;
        }
        if (arr[halfway] > key) {
            return binarySearchRecursiveHelper(arr, key, low, halfway - 1);
        } else if (arr[halfway] < key) {
            return binarySearchRecursiveHelper(arr, key, halfway + 1, high);
        } else {
            return halfway;
        }
    }

    // DO NOT EDIT! Work on the helper version above this method. This method is to be used for testing purposes only.
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1);
    }

}
