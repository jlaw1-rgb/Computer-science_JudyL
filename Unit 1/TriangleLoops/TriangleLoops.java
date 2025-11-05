public class TriangleLoops {
    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int n = 0; n < i; n++) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = numberOfRows; i > 0; i = i - 1) {
            for (int n = i; n > 0; n = n - 1) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int n = 0; n < i; n++) {
                triangle = triangle + i + " ";
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        String triangle = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int s = 0; s < numberOfRows - i - 1; s++) {   //space
                triangle = triangle + " ";
            }
            for (int a = 0; a <= i; a++) {
                triangle = triangle + (char) ('A' + a);       // ascending letters
            }
            for (int d = i; d > 0; d--) {
                triangle = triangle + (char) ('A' - 1 + d);  // descending letters
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }
}