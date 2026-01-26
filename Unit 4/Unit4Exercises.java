
import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            end[i] = nums[(nums.length - n) + i];
        }
        for (int c = 0; c < n; c++) {
            if (nums[c] != end[c]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        if (nums.length < 3) {
            System.out.println("Too short array");
            return false;
        }
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int length = end - start;
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = start + i;
        }
        return ar;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        int[] fb = generateNumberSequence(start, end);
        String[] fbz = new String[fb.length];
        for (int i = 0; i < fb.length; i++) {       //convert to string array
            fbz[i] = String.valueOf(fb[i]);
        }
        for (int i = 0; i < fb.length; i++) {
            if (fb[i] % 3 == 0) {
                fbz[i] = "Fizz";
            }
            if (fb[i] % 5 == 0) {
                fbz[i] = "Buzz";
            }
            if (fb[i] % 15 == 0) {
                fbz[i] = "FizzBuzz";
            }
        }
        return fbz;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] odd = new int[nums.length];
        int[] even = new int[nums.length];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even[evenCount] = nums[i];
                evenCount++;
            } else {
                odd[oddCount] = nums[i];
                oddCount++;
            }
        }
        int[] rearranged = new int[nums.length];
        for (int i = 0; i < rearranged.length; i++) {
            if (i < evenCount) {
                rearranged[i] = even[i];
            } else {
                rearranged[i] = odd[i - evenCount];
            }
        }
        return rearranged;
    }

    // ArrayList Methods
    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
