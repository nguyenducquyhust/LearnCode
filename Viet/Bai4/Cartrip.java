package Bai4;

public class Cartrip {
    private String idtrip;
    private String drivername;
    private int soxe;
    private int revenue;
    public  Cartrip(){}

    public Cartrip(String idtrip, String drivername, int soxe, int revenue) {
        this.idtrip = idtrip;
        this.drivername = drivername;
        this.soxe = soxe;
        this.revenue = revenue;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String getIdtrip() {
        return idtrip;
    }

    public void setIdtrip(String idtrip) {
        this.idtrip = idtrip;
    }


}
