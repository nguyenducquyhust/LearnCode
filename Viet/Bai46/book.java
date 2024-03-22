package Bai46;

public abstract class  book {
    private String bookid;
    private String date;
    private double quantity;
    private double price;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public double  Thanhtien(){
        return this.price*this.quantity;
    }

    public book(String bookid, String date, int quantity, int price) {
        this.bookid = bookid;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
    }
    public book(){}

}
