public class Rectangle {
    private int length;
    private int width;
    public Rectangle(){}
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    @Override
    public String toString(){
        return "length: " + length + "width: " + width;
    }
}
