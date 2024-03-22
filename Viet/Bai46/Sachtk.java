package Bai46;

public class Sachtk extends book{
    private double tax;

    public Sachtk(String bookid, String date, int quantity, int price, double tax) {
        super(bookid, date, quantity, price);
        this.tax = tax;
    }
    @Override
    public double Thanhtien(){
        return super.Thanhtien() + this.tax;
    }

}
