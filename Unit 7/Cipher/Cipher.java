
public class Cipher {

    private static char encodeChar(char c) {
        if (((int) c >= 65 && (int) c <= 90) || ((int) c >= 97 && (int) c <= 122)) {
            if (c == 'x' || c == 'y' || c == 'z' || c == 'X' || c == 'Y' || c == 'Z') {
                return (char) ((int) c - 23);
            }
            return (char) ((int) c + 3);
        }
        return c;
    }

    public static String encode(String message) {
        if (message == null) {
            throw new IllegalArgumentException();
        }
        if (message.equals("") || message.length() == 0) {
            return "";
        }
        return encodeChar(message.charAt(0)) + encode(message.substring(1));
    }

    private static char decodeChar(char c) {
        if (((int) c >= 65 && (int) c <= 90) || ((int) c >= 97 && (int) c <= 122)) {
            if (c == 'a' || c == 'b' || c == 'c' || c == 'A' || c == 'B' || c == 'C') {
                return (char) ((int) c + 23);
            }
            return (char) ((int) c - 3);
        }
        return c;
    }

    public static String decode(String encodedMessage) {
        if (encodedMessage == null) {
            throw new IllegalArgumentException();
        }
        if (encodedMessage.equals("") || encodedMessage.length() == 0) {
            return "";
        }
        return decodeChar(encodedMessage.charAt(0)) + decode(encodedMessage.substring(1));
    }

    public static String compress(String message) {
        if (message == null) {
            throw new IllegalArgumentException();
        }
        if (message.equals("") || message.length() == 0) {
            return "";
        }
        String ret = "";
        int count = 1;
        for (int i = 0; i < message.length() - 1; i++) {
            if (message.charAt(i) == message.charAt(i + 1)) {
                count++;
                if (i == message.length() - 2) {
                    ret = ret + message.charAt(i + 1) + count;
                }
            } else {
                ret = ret + message.charAt(i) + count;
                count = 1;
                if (i == message.length() - 2) {
                    ret = ret + message.charAt(i + 1) + "1";
                }
            }
        }
        return ret;

    }

    public static String decompress(String compressedMessage) {
        if (compressedMessage == null || compressedMessage.contains("0")) {
            throw new IllegalArgumentException();
        }
        if (compressedMessage.equals("") || compressedMessage.length() == 0) {
            return "";
        }
        String decomp = "";
        int times = Integer.parseInt("" + compressedMessage.charAt(1));
        int count = 0;
        System.out.println(compressedMessage.charAt(1));
        for (int i = 2; i < compressedMessage.length(); i++) {
            if (Character.isDigit(compressedMessage.charAt(i))) {
                times = Integer.parseInt("" + compressedMessage.substring(1, i + 1));
                count++;
            } else {
                break;
            }
        }
        for (int i = 0; i < times; i++) {
            decomp = decomp + compressedMessage.charAt(0);
        }
        if (compressedMessage.length() <= 2) {
            return decomp;
        } else {
            return decomp + decompress(compressedMessage.substring(2 + count));
        }
    }

}
