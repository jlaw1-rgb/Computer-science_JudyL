public class line {
    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) { 
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateSlope() {
        slope = -a/b;
        return slope;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if (ax + by + c == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        return "" + a + "x + " + b + "y + " + c + " = 0";
    }

    
}