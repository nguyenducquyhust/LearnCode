package Bai7;

import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {
    Scanner scanner = new Scanner(System.in);
    private String tiGia;
    private String loaiTien;
    private double thanhTien;

    public GiaoDichTienTe() {
        super();
    }

    public GiaoDichTienTe(String tiGia, String loaiTien, double thanhTien) {
        super();
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
        this.thanhTien = thanhTien;
    }

    public String getTiGia() {
        return tiGia;
    }

    public void setTiGia(String tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" +
                "tiGia='" + tiGia + '\'' +
                ", loaiTien='" + loaiTien + '\'' +
                ", thanhTien='" + thanhTien + '\'' +
                '}';
    }
}