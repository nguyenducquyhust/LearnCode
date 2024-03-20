package Bai2;

import java.util.Scanner;

public class SinhVien {
    static Scanner scanner = new Scanner(System.in);
    private int maSinhVien;
    private String hoTen;
    private String diaChi;
    private int soDienThoai;

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String hoTen, String diaChi, int soDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    /**
     * Ham nhap thong tin
     */
    public void nhapThongTin() {
        System.out.println(" nhap ma so sinh vien: ");
        this.maSinhVien = scanner.nextInt();

        System.out.println(" nhap ho ten: ");
        this.hoTen = scanner.toString();

        System.out.println(" nhap dia chi: ");
        this.diaChi = scanner.toString();

        System.out.println(" nhap so dien thoai: ");
        this.soDienThoai = scanner.nextInt();

    }


    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }

}

