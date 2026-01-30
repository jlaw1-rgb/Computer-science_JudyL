
public class SkyView {

    private double[][] view;

    SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows < 1 || numberOfCols < 1) {
            throw new IllegalArgumentException("Error - input too small.");
        }
        if (scanned.length != (numberOfCols * numberOfRows)) {
            throw new IllegalArgumentException("Error - invalid input.");
        }
        this.view = new double[numberOfRows][numberOfCols];
        boolean toTheRight = true;
        for (int r = 0; r < numberOfRows; r++) {
            if (toTheRight == true) {
                for (int c = 0; c < numberOfCols; c++) {
                    view[r][c] = scanned[(r * numberOfCols) + c];
                }
            } else {
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[((r + 1) * numberOfCols) - c - 1];
                }
            }
            toTheRight = !toTheRight;
        }
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public String toString() {
        String returnString = "";
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                returnString = returnString + view[r][c] + " ";
            }
            returnString = returnString + "\n";
        }
        return returnString;
    }

    public boolean equals(SkyView other) {
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                if (view[r][c] != other.view[r][c]) {   //??
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || endRow < 0 || startCol < 0 || endCol < 0) {
            throw new IllegalArgumentException("Error - input must > 0.");
        }
        if (startRow > endRow || startCol > endCol) {
            throw new IllegalArgumentException("Error - start must < end.");
        }
        if (startRow > view.length || startCol > view[0].length) {
            throw new IllegalArgumentException("Input index out of bounds.");
        }
        double total = 0;
        int number = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                total = total + view[r][c];
                number++;
            }
        }
        return (double) total / number;
    }
}
