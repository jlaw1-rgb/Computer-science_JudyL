
import java.util.Arrays;

public class Unit4ExercisesTester {

    public static void main(String[] args) {
        System.out.println("\nTESTING matchingEndSequences");
        int[] a = new int[]{1, 3, 6, 5, 1, 3};
        System.out.println("" + Unit4Exercises.matchingEndSequences(a, 2));

        System.out.println("\nTESTING hasThreeConsecutive");
        int[] b = new int[]{1, 3, 5, 3};
        System.out.println(Unit4Exercises.hasThreeConsecutive(b));

        System.out.println("\nTESTING generateNumberSequence");
        System.out.println("" + Arrays.toString(Unit4Exercises.generateNumberSequence(2, 8)));

        System.out.println("\nTESTING moveEvenBeforeOdd");
        int[] c = new int[]{1, 2, 5, 3, 4, 0};
        System.out.println("" + Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(c)));

    }
}
