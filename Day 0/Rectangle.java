public class Rectangle {
    private int length;
    private int width;

    // defines the instance variables with the local parameters
    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }    

    // setters
    public void setLength(int newLength) {
        length = newLength;
    }

    // methods
    public int getArea() {
        int area = length * width;
        return area;
    }
    
    public int getPerimeter() {
        int perimeter = length + length + width + width;
        return perimeter;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return diagonal;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
