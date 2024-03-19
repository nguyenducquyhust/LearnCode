package day11.exercise7;

import java.util.Scanner;

public class GiaoDich {
    static Scanner scanner = new Scanner(System.in);

    protected String maGiaoDich;
    protected String ngayGiaoDich;
    protected long donGia;
    protected int soLuong;

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

    public void nhapThongTin() {
        System.out.print("Nhap ma giao dich: ");
        this.maGiaoDich = scanner.nextLine();
        System.out.print("Nhap ngay giao dich: ");
        this.ngayGiaoDich = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        this.donGia = scanner.nextLong();
        System.out.print("Nhap so luong: ");
        this.soLuong = scanner.nextInt();
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
}
