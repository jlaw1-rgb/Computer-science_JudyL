
public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.

    public static double calculateAverageStringLength(String[] strs) {
        if (strs == null) {
            // Added if to check for null array
            return 0.0;
        }
        int sum = 0;
        int counted = 0;
        int i = 0;
        while (i < strs.length) {
            if (strs[i] != null) {      // Added if to check for null string in array
                sum += strs[i].length();
                counted++;
            }
            i++;
        }
        return sum / counted;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        if (str == null) {      // Added if
            return "Null array exception";
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;        // Removed -1
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]);
        }
        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {      // added if
            return 0;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];       // change from i - 1 to i
            } else if (numbers[i] == max && i % 2 == 0) {
                max = max + 1;
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and backwards.
    public static boolean isPalindrome(String str) {
        if (str == null || str.equals("")) {        //added if to check edge case
            return false;
        }
        return str.equals(reverseString(str));      //rewrote using existing method
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {     //changed from < to <=
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];      // deleted +1
            }      // removed else case
        }
        if (sum == 0) {
            sum = numbers.length;
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {  // changed from 1 to 0
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int[] sortArrayDescending(int[] arr) { // changed from void to return int[]
        if (arr == null) {
            return new int[0];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {      // change form < to >
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;     // added return statement
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            return "Invalid sentence.";
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) { // changed from >= to >
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years < 0 || years % 2 != 0) {
            return 0.0;
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        int number = Integer.parseInt(str);
        if (number < 0) {
            return 1;
        }
        return number; // Method should return 1 if it's negative
    }

    public static String getArrayElement(String[] arr, int index) {
        if (arr == null || index >= arr.length) {
            System.out.println("Something went wrong. ");
            return null;
        }
        return arr[index];
    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            System.out.println("Number has to be positive.");
            return Double.NaN;
        }
        return Math.sqrt(number);
    }

    public static int sumArrayElements(int[] array) {
        if (array == null) {
            System.out.println("Array can not be null. ");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double calculatePower(double base, int exponent) {
        if (base < 0) {
            return 1.0;
        }
        return Math.pow(base, exponent);
    }

    // throw new IllegalArgumentException("bad code");
}
