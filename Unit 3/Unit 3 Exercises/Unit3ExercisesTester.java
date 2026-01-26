
import java.util.Arrays;

public class Unit3ExercisesTester {

    public static void main(String[] args) {
        // Test Case - Main Case
        String[] letters = {"abc", "cde", "efg", "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        System.out.println("EDGE CASE TEST");

        // Test Case - Edge Case: Null element in array
        letters = new String[]{"abc", "cde", "efg", null, "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

        System.out.println("\nTESTING REVERSE STRING");

        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

        System.out.println("\nTESTING FIND MAX VALUE");

        // main case
        int[] numArr = {3, 2, 9, 5, 12};
        System.out.println("Expected 12: " + Unit3Exercises.findMaxValue(numArr));

        // edge case - negavtive + zero
        numArr = new int[]{-1, 2, 0, 5, -2};
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(numArr));

        // edge case - negative only
        numArr = new int[]{-1, -9, -8, -3, -2};
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(numArr));

        // edge case - null
        numArr = null;
        System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(numArr));

        System.out.println("\nTESTING isPalindrome");

        // main case: yes palidrome
        String tString = "deed";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(tString));

        // main 2: yes palidrome
        tString = "world";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(tString));

        // edge null string
        tString = null;
        System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(tString));

        // edge empty string
        tString = "";
        System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(tString));

        System.out.println("\nTESTING sum even numbers");

        // main case
        int[] testnumArr = {3, 2, 9, 8, 4, 12};
        System.out.println("Expected 14: " + Unit3Exercises.sumEvenNumbers(testnumArr));

        // edge case - negative
        testnumArr = new int[]{-2, -3, -9, -8, -4, -10};
        System.out.println("Expected -24: " + Unit3Exercises.sumEvenNumbers(testnumArr));

        // edge case - positive and negative
        testnumArr = new int[]{-2, 2, 9, -8, -1, -10};
        System.out.println("Expected -18: " + Unit3Exercises.sumEvenNumbers(testnumArr));

        // edge case - positive and negative
        testnumArr = null;
        System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(testnumArr));

        System.out.println("\nTESTING sum of squares");

        // main case
        int[] sumArr = {3, 2, 2, 1, 4, 2};
        System.out.println("Expected 38: " + Unit3Exercises.calculateSumOfSquares(sumArr));

        // edge case: null array
        try {
            sumArr = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(sumArr));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

        System.out.println("\nTESTING get Fibonacci");

        // main case
        int num = 7;
        System.out.println("Expected 13: " + Unit3Exercises.getNthFibonacci(num));

        System.out.println("\nTESTING sort descending array");

        // main case
        int unsortArray[] = {2, 4, 5, 1, 9, 7};
        System.out.println("Expected: [9, 7, 5, 4, 2, 1]: "
                + Arrays.toString(Unit3Exercises.sortArrayDescending(unsortArray)));

        // main - with negative
        unsortArray = new int[]{2, -3, 5, -1, 9, 7};
        System.out.println("Expected: [9, 7, 5, 2, -1, -3]: "
                + Arrays.toString(Unit3Exercises.sortArrayDescending(unsortArray)));

        // edge case: null array
        try {
            unsortArray = null;
            System.out.println("Expected exception: " + Arrays.toString(Unit3Exercises.sortArrayDescending(unsortArray)));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception since the array was null.");
        }

        System.out.println("\nTESTING find longest word");

        // main case
        String sentence = "I like to eat oranges";
        System.out.println("Expected oranges: " + Unit3Exercises.findLongestWord(sentence));
        // main - same longest length
        sentence = "Four ice cubes are here";
        System.out.println("Expected cubes: " + Unit3Exercises.findLongestWord(sentence));
        // edge - null
        try {
            sentence = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentence));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception since the string was null.");
        }

        System.out.println("\nTESTING calculate interest");

        // main
        int principal = 500;
        int rate = 2;
        int years = 12;
        System.out.println("Expected 634.12: "
                + Unit3Exercises.calculateInterest(principal, rate, years));

        // edge
        try {
            principal = -2;
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("Principal value can not be negative.");
        }

        System.out.println("\nTESTING parse positive int");

        try {
            String toParse = "91.2";
            System.out.println("Expected 91: " + Unit3Exercises.parsePositiveInteger(toParse));
        } catch (Exception e) {
            System.out.println("Numbers can not be negative or contain decimal. " + e.getMessage());
        }

        System.out.println("\nTESTING get array element");

        try {
            String[] arr = {"123", "This one"};
            int index = 3;
            System.out.println(Unit3Exercises.getArrayElement(arr, index));
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        System.out.println("\nTESTING calculate square root");

        try {
            int root = -8;
            System.out.println(Unit3Exercises.calculateSquareRoot(root));
        } catch (Exception e) {
            System.out.println("Number can not be negative. ");
        }

        System.out.println("\nTESTING calculate power");

    }
}
