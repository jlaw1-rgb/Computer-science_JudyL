public class Line {
    private double a;
    private double b;
    private double c;
    private Point p1;
    private Point p2;

    public Line(double a, double b, double c) { 
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

        // instance variables a, b, and c
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY()); 

        // b = x2 - x1
        this.b = p2.getX() - p1.getX(); 

        // c = - (a * x1 + b * y1)
        this.c = (this.a * p1.getX() + p1.getY() * this.b); 
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculateSlope() {
        double slope = - (a / b);
        return slope;
    }

    public double calculateSlopeFromPoints() {
        double slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        return slope;
    }

    public String generatePointSlopeFormula() {
        String formula = "(y - " + p1.getY() + ") = "
            + calculateSlopeFromPoints() + "(x - " + p1.getX() + ")";
        return formula;
    }


    public boolean isCoordinateOnLine(Point p) {
        if (a * p.getX() + b * p.getY() + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnLine(Point p) {
        if (a * p.getX() + b * p.getY() + c == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        return "" + a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean equals(Line other) {
        if (this.a == other.a && this.b == other.b && this.c == other.c) {
            return true;
        } else {
            return false;
        }
    }
}