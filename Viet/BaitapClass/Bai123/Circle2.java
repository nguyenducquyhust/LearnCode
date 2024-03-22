class Circle2 {
    private  double radius = 1.0;
    private String color = "red";
    public Circle2(){}
    public Circle2(String color){
        this.color = color;
    }
    public Circle2(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getP(){
        return 2*3.14*radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    @Override
    public String toString(){
        return  "Radiu: " + radius + " Color: " + color;
    }
    }