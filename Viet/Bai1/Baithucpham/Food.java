package Bai1.Baithucpham;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Food {
    private final String maHang = "";
    private String tenhang;
    private double dongia;
    private LocalDate ngaysanxuat;
    private LocalDate ngayhethang;

    public Food(String tenhang, double dongia, LocalDate ngaysanxuat, LocalDate ngayhethang) {
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.ngaysanxuat = ngaysanxuat;
        this.ngayhethang = ngayhethang;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public LocalDate getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(LocalDate ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public LocalDate getNgayhethang() {
        return ngayhethang;
    }

    public void setNgayhethang(LocalDate ngayhethang) {
        this.ngayhethang = ngayhethang;
    }

    @Override
    public String toString() {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return "Food{" +
                "maHang='" + maHang + '\'' +
                ", tenhang='" + tenhang + '\'' +
                ", dongia=" + formatdongia() +
                ", ngaysanxuat=" + ngaysanxuat.format(dt) +
                ", ngayhethang=" + ngayhethang.format(dt) +
                '}';
    }
    public String formatdongia(){
        DecimalFormat dcm = new DecimalFormat("#,###");
        return dcm.format(this.dongia);
    }

    public void hethan(){
        LocalDate lc = LocalDate.now();
        if(this.ngayhethang.compareTo(lc) >= 0){
            System.out.println("dung dc");
        }else{
            System.out.println("het bo han roi ");
        }
    }
}
