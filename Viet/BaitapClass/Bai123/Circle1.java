public class Circle1 {
    private String color = "red";
    private double radius = 1.0;
    private double area;
    public Circle1(){}
    public Circle1(double radius){
        this.radius = radius;
    }
    public Circle1(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color= color;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public void display(){
        System.out.print(area);
    }

}
