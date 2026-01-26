
public class MatrixFun {

    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Invalid input. ");
        }
        this.matrix = new int[numberOfRows][numberOfCols];
        randomlyFillCell(numberOfRows, numberOfCols);
    }

    public MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i].length != matrix[i + 1].length) {
                System.out.println("Warning: this matrix in irregular.");
            }
        }
    }

    public MatrixFun() {
        this.matrix = new int[3][3];
        randomlyFillCell(3, 3);
    }

    public void randomlyFillCell(int r, int c) {
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                this.matrix[row][col] = (int) (Math.random() * 10);
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString() {
        String matrixS = "";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrixS = matrixS + matrix[r][c] + " ";
            }
            matrixS = matrixS + "\n";
        }
        String equals = "";
        equals += "=".repeat((matrix[0].length * 2) - 1);
        equals = equals + "\n";
        return equals + matrixS + equals;
    }

    public boolean equals(MatrixFun matrixFun) {
        return (matrix.toString()).equals(matrixFun.toString());
    }

    public boolean equals(int[][] other) {
        if (this.matrix.length != other.length) {
            return false;
        }
        for (int r = 0; r < this.matrix.length; r++) {
            if (matrix[r].length != other[r].length) {
                return false;
            }
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] != other[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0 || rowA > matrix.length || rowB > matrix.length) {
            throw new IllegalArgumentException("Invalid row number. ");
        }
        int[] new1 = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = new1;
    }
}
