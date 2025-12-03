public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (vacation == false) {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        int difference = Math.abs(a - b);
        int sum = a + b;
        return (a == 6 || b == 6 || difference == 6 || sum == 6);
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && a == c && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        if (str.equals("")) {
            return "";
        }
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1);
        if (first.equals("f") && last.equals("b")) {
            return "FizzBuzz";
        } else if (first.equals("f")) {
            return "Fizz";
        } else if (last.equals("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public static String doubleChar(String str) {
        String new1 = "";
        for (int i = 0; i < str.length(); i++) {
            new1 = new1 + str.charAt(i);
            new1 = new1 + str.charAt(i);
        }
        return new1;
    }

    public static int countHi(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count = count + 1;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        str = str.toLowerCase();
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd'
                && str.charAt(i + 1) == 'o'
                && str.charAt(i + 2) == 'g') {
                dogCount = dogCount + 1;
            }
        }
        int catCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c'
                && str.charAt(i + 1) == 'a'
                && str.charAt(i + 2) == 't') {
                catCount = catCount + 1;
            }
        }
        return (dogCount == catCount);
    }

    public static String mixString(String a, String b) {
        String new1 = "";
        for (int i = 0; i < longerString(a, b).length(); i++) {
            if (i < a.length()) {
                new1 = new1 + a.charAt(i);
            }
            if (i < b.length()) {
                new1 = new1 + b.charAt(i);
            }
        }
        return new1;
    }

    public static String repeatEnd(String str, int n) {
        String new1 = "";
        for (int i = 0; i < n; i++) {
            new1 = new1 + str.substring(str.length() - n);
        }
        return new1;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        String longer;
        String shorter;
        if (longerString(a, b).equals(a)) {
            longer = a;
            shorter = b;
        } else {
            longer = b;
            shorter = a;
        }
        return (longer.substring(longer.length()
            - shorter.length()).equals(shorter));
    }

    public static int countCode(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c'
                && str.charAt(i + 1) == 'o'
                && str.charAt(i + 3) == 'e') {
                count = count + 1;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int big = nums[0];
        int small = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (big < Math.max(big, nums[i])) {
                big = nums[i];
            }
            if (small > Math.min(small, nums[i])) {
                small = nums[i];
            }
        }
        return big - small;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums [i] == 13) {
                return sum;
            } else {
                sum = sum + nums [i];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] new1 = new int[n];
        for (int i = 0; i < n; i++) {
            new1[i] = i;
        }
        return new1;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        boolean adjacent = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count = count + 1;
            }
            if (i != nums.length - 1 && nums[i] == 3 && nums[i + 1] == 3) {
                adjacent = true;
            }
        }
        return count == 3 && adjacent == false;
    }

    public static String[] fizzArray2(int n) {
        String[] new1 = new String[n];
        for (int i = 0; i < n; i++) {
            new1 [i] = String.valueOf(i);
        }
        return new1;
    }

    public static int[] zeroFront(int[] nums) {
        int zeros = 0;
        int[] new1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros = zeros + 1;
            }
        }
        int nonZeros = 0;
        for (int z = 0; z < zeros - 1; z++) {
            new1[z] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                new1[zeros + nonZeros] = nums[i];
                nonZeros = nonZeros + 1;
            }
        }
        return new1;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                count = count + 1;
            }
        }
        String[] new1 = new String[words.length - count];
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target) == false) {
                n = n + 1;
                new1[n - 1] = words[i];
            }
        }
        return new1;
    }

    public static int scoresAverage(int[] scores) {
        int firstAverage = calculateAverage(scores, 0, scores.length / 2);
        int secondAverage = calculateAverage(scores, scores.length / 2, scores.length);
        return largerInt(firstAverage, secondAverage);
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return findSpecial(a) + findSpecial(b);
    }

    public static String firstTwo(String str) {
        String s = "";
        for (int i = 0; i < 2; i++) {
            if (i >= str.length()) {
                s = s + "*";
            } else {
                s = s + str.charAt(i);
            }
        }
        return s;
    }

    public static double divide(int a, int b) {
        int larger = largerInt(a, b);
        int smaller = smallerInt(a, b);
        if (smaller == 0) {
            return 0.0;
        }
        return (double) larger / smaller;
    }



    public static int calculateAverage(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = 0; i < end - start; i++) {
            sum = sum + scores[i + start];
        }
        return sum / (end - start);
    }

    public static int findSpecial(int[] a) {
        int largestSpecial = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                largestSpecial = largerInt(largestSpecial, a[i]);
            }
        }
        return largestSpecial;
    }

    public static int largerInt(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int smallerInt(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static String longerString(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }
    }
}