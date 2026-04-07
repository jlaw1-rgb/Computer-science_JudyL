
public class Sort {

    int[] nums;

    public Sort() {
        nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
    }

    public void sort() {
        while (isSorted() == false) {
            for (int i = 0; i < nums.length - 1; i++) {
                swapIfNecessary(i, i + 1);
            }
        }
        System.out.println("\nAfter sort:\n");
    }

    public boolean isSorted() {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void swapIfNecessary(int first, int second) {
        int temp = nums[first];
        if (nums[first] > nums[second]) {
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }

    public void print() {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Number " + i + ": " + nums[i]);
        }
    }
}
