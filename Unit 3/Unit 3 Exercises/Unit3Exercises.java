
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
        if (str == null || str.equals("")) {
            return false;
        }
        return str.equals(reverseString(str));
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {     //changed from < to <=
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];      // removed +1
            }      // removed else case
        }
        if (sum == 0) {
            sum = numbers.length;
        }
        return sum;
    }
}
