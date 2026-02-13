
public class Triangle extends Polygon {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        super(3);
        this.base = 3;
        this.height = 4;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public String toString() {
        return super.toString() + "\nThis is a rectangle with a base of " + base
                + " and a height of " + height + ". Its area is " + getArea() + ".";
    }
}
