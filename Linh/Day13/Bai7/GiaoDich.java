package Bai7;

import java.util.Scanner;

public class GiaoDich {
    Scanner scanner = new Scanner(System.in);
    private String maGiaoDich;
    private String ngayGiaoDich;
    private long donGia;
    private int soLuong;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }
    public void nhap() {
        System.out.print("Nhap ma giao dich: ");
        maGiaoDich = scanner.nextLine();

        System.out.print("Nhap ngay giao dich (ngay/thang/nam): ");
        ngayGiaoDich = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = scanner.nextLong();

        System.out.print(" Nhap so luong: ");
        soLuong = scanner.nextInt();
    }

}