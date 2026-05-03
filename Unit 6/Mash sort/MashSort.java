
import java.util.Arrays;

public class MashSort {

    public static int[] combineSortedArrays(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int idxA = 0;
        int idxB = 0;
        for (int i = 0; i < answer.length; i++) {
            if (idxA == a.length) {
                answer[i] = b[idxB];
                idxB++;
            } else if (idxB == b.length) {
                answer[i] = a[idxA];
                idxA++;
            } else {
                if (a[idxA] > b[idxB]) {
                    answer[i] = b[idxB];
                    idxB++;
                } else {
                    answer[i] = a[idxA];
                    idxA++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {0, 4, 11};
        int[] b = {3, 6, 10, 13, 15};
        System.out.println(Arrays.toString(combineSortedArrays(a, b)));
    }

}
