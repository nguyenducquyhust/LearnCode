package Bai1;

public class Vehicle {
    private String name;
    private int size;
    private double price;
    public Vehicle(String name,int size,int price){
        this.name = name;
        this.size = size;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public double payTax(){
        if(this.size < 100){
            return this.getPrice()/100;
        }
        else if( this.size >= 100 && this.size<200){
            return this.getPrice()*3/100;
        }else{
            return this.getPrice()*5/100;
        }
    }
}
