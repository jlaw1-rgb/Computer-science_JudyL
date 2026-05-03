
import java.util.ArrayList;

public class BinaryAndHexadecimalConversion {

    // Given an int, returns the binary representation of that int as a String
    // Precondition: num >= 0
    public static String convertIntToBinary(int num) {
        if (num == 1 || num == 0) {
            return "" + num;
        } else {
            if (num % 2 == 0) {
                return convertIntToBinary(num / 2) + "0";
            } else {
                return convertIntToBinary(num / 2) + "1";
            }
        }
    }

    // Given a String of a binary representation of an int, returns that int
    // Precondition: binary string is not negative
    public static int convertBinaryToInt(String binary) {
        if (binary.length() == 0) {
            return 0;
        }
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < binary.length(); i++) {
            a.add("" + binary.charAt(i));
        }
        int tenBase = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("1")) {
                tenBase = tenBase + Integer.parseInt(a.get(i)) * (int) Math.pow(2, binary.length() - i - 1);
            }
        }
        return tenBase;
    }

    // Given an int, returns the hexadecimal representation of that int as a String
    // Precondition: num >= 0
    public static String convertIntToHexadecimal(int num) {
        return convertBinaryToHexadecimal(convertIntToBinary(num));
    }

    // Given a String of a hexadecimal representation of an int, returns that int
    // Precondition: hexadecimal string is not negative
    public static int convertHexadecimalToInt(String hex) {
        return convertBinaryToInt(convertHexadecimalToBinary(hex));
    }

    // Given a String of a hexadecimal representation of an int,
    // returns the String of the binary representation
    // Precondition: hexadecimal string is not negative
    public static String convertHexadecimalToBinary(String hex) {
        if (hex.length() <= 1) {
            return hexHelp(hex);
        }
        return hexHelp("" + hex.charAt(0)) + convertHexadecimalToBinary(hex.substring(1, hex.length()));
    }

    // Given a String of a binary representation of an int,
    // returns the String of the hexadecimal representation
    // Precondition: hexadecimal string is not negative
    public static String convertBinaryToHexadecimal(String binary) {
        if (binary.length() <= 4) {
            return binaryHelp(binary);
        }
        return convertBinaryToHexadecimal(binary.substring(0, binary.length() - 4)) + binaryHelp("" + binary.substring(binary.length() - 4, binary.length()));
    }

    // Converts the String representation of the number to an int.
    // If the String starts with 0b, then convert the rest of the String as if it
    // were binary.
    // If the String starts with 0x, then convert the rest of the String as if it
    // were hexadecimal.
    // If the String starts with neither, then convert the rest of the String as if
    // it were decimal.
    public static int convertStringToInt(String numString) {
        if (numString.substring(0, 2).equals("0b")) {
            return convertBinaryToInt(numString);
        } else if (numString.substring(0, 2).equals("0x")) {
            return convertHexadecimalToInt(numString);
        } else {
            for (int i = 0; i < numString.length(); i++) {
                if ((int) numString.charAt(i) < 48 || (int) numString.charAt(i) > 57) {
                    throw new IllegalArgumentException();
                }
            }
            return Integer.parseInt(numString);
        }
    }

    //
    //helpermethods
    //
    public static String hexHelp(String hex) {
        if (hex.equals("a")) {
            return "1010";
        } else if (hex.equals("b")) {
            return "1011";
        } else if (hex.equals("c")) {
            return "1100";
        } else if (hex.equals("d")) {
            return "1101";
        } else if (hex.equals("e")) {
            return "1110";
        } else if (hex.equals("f")) {
            return "1111";
        } else {
            String binary = convertIntToBinary(Integer.parseInt(hex));
            while (binary.length() <= 3) {
                binary = "0" + binary;
            }
            return binary;
        }
    }

    public static String binaryHelp(String binary) {
        if (binary.equals("1010")) {
            return "a";
        } else if (binary.equals("1011")) {
            return "b";
        } else if (binary.equals("1100")) {
            return "c";
        } else if (binary.equals("1101")) {
            return "d";
        } else if (binary.equals("1110")) {
            return "e";
        } else if (binary.equals("1111")) {
            return "f";
        } else {
            return "" + convertBinaryToInt(binary);
        }
    }
}
