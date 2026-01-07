
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
        int[] NumArr = {3, 2, 9, 5, 12};
        System.out.println("Expected 12: " + Unit3Exercises.findMaxValue(NumArr));

        // edge case - negavtive + zero
        NumArr = new int[]{-1, 2, 0, 5, -2};
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(NumArr));

        // edge case - negative only
        NumArr = new int[]{-1, -9, -8, -3, -2};
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(NumArr));

        // edge case - null
        NumArr = null;
        System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(NumArr));

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
        int[] testNumArr = {3, 2, 9, 8, 4, 12};
        System.out.println("Expected 14: " + Unit3Exercises.sumEvenNumbers(testNumArr));

        // edge case - negative
        testNumArr = new int[]{-2, -3, -9, -8, -4, -10};
        System.out.println("Expected -24: " + Unit3Exercises.sumEvenNumbers(testNumArr));

        // edge case - positive and negative
        testNumArr = new int[]{-2, 2, 9, -8, -1, -10};
        System.out.println("Expected -18: " + Unit3Exercises.sumEvenNumbers(testNumArr));

        // edge case - positive and negative
        testNumArr = null;
        System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(testNumArr));

    }
}
