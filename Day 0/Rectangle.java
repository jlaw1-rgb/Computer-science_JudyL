public class Rectangle {
    private int length;
    private int width;

    // defines the instance variables with the local parameters
    public Rectangle(int desiredLength, int desiredWidth){
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
    public void setLength(int newLength){
        length = newLength;
    }

    // methods
    public int calculateArea() {
        int area = length * width;
        return area;
    }
    
    public int calculatePerimeter() {
        int perimeter = length + length + width + width;
        return perimeter;
    }


    }

