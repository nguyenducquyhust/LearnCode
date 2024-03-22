package Bai46;

public class Sachgk extends book {
    private String status;

    public Sachgk(String bookid, String date, int quantity, int price, String status) {
        super(bookid, date, quantity, price);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public double Thanhtien(){
        if (this.status.equals("new")){
            return  super.Thanhtien();
        }else{
            return super.Thanhtien()/2;
        }
    }
}
