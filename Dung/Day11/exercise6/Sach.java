package day11.exercise6;

import java.util.Scanner;

public class Sach {
    static Scanner scanner = new Scanner(System.in);
    protected String maSach;
    protected String ngayNhap;
    protected long donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
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

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void nhapThongTin() {
        System.out.print("Nhap ma sach: ");
        this.maSach = scanner.nextLine();
        System.out.print("Nhap ngay nhap: ");
        this.ngayNhap = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        this.donGia = scanner.nextLong();
        System.out.print("Nhap so luong: ");
        this.soLuong = scanner.nextInt();
        System.out.print("Nhap nha xuat ban: ");
        this.nhaXuatBan = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                '}';
    }
}
