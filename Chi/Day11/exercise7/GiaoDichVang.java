package exercise7;

import java.util.Scanner;

public class GiaoDichVang extends GiaoDich {
    Scanner scanner = new Scanner(System.in);
    private String loaiVang;
    private String thanhTien;

    public GiaoDichVang() {
        super();
    }

    public GiaoDichVang(String loaiVang, String thanhTien) {
        super();
        this.loaiVang = loaiVang;
        this.thanhTien = thanhTien;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" +
                "loaiVang='" + loaiVang + '\'' +
                ", thanhTien='" + thanhTien + '\'' +
                '}';
    }

}
