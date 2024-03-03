package EX2;

public class Rectangle {
    private int Length;
    private int Width;
    private int Area;

    public Rectangle(){

    }

    public Rectangle(int length, int width) {
        Length = length;
        Width = width;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }
    public int getArea(){
        return Area = Width * Length;
    }

    public String toString() {
        return "Rectangle:" +
                "Length= " + Length +
                ", Width= " + Width +
                "Area = " + Area
                ;
    }
}
