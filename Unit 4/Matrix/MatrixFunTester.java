
public class MatrixFunTester {

    public static void main(String[] args) {
        MatrixFun mat = new MatrixFun(4, 2);
        System.out.println(mat);
        System.out.println(mat.toString());
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}};

        MatrixFun mat1 = new MatrixFun(mat2);
        MatrixFun mat0 = new MatrixFun(mat2);

        System.out.println("TESTING 1st equals (expect true):  " + mat0.equals(mat1));
        System.out.println(mat1.equals(mat2));

        System.out.println("\nTESTING replaceALL:\n\nBefore:\n" + mat1.toString());
        mat1.replaceAll(2, 0);
        System.out.println("\nAfter:\n" + mat1);

        System.out.println("TESTING swap:\n\nBefore:\n" + mat);
        mat.swapRow(1, 2);
        System.out.println("\nAfter:\n" + mat);

    }
}
