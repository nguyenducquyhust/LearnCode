package Bai8;

import java.time.LocalDate;
import java.util.Scanner;

public class KhachHang {
    Scanner scanner = new Scanner(System.in);
    protected String maKhachHang;
    protected String hoTen;
    protected LocalDate ngayRaHoaDon;
    protected Integer soLuong;
    protected Float donGia;

    public KhachHang() {

    }

    public KhachHang(String maKhachHang, String hoTen, LocalDate ngayRaHoaDon, Integer soLuong, Float donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(LocalDate ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return
                "maKhachHang='" + maKhachHang + '\'' +
                        ", hoTen='" + hoTen + '\'' +
                        ", ngayRaHoaDon=" + ngayRaHoaDon +
                        ", soLuong=" + soLuong +
                        ", donGia=" + donGia +
                        '}';
    }

    public Double thanhTien() {
        return (double) (soLuong * donGia);
    }


// can chinh ( Ctrl + ALT + L)

    public void thongTinKhachHang() {
        System.out.println("Nhap ma khach hang:");
        maKhachHang = scanner.nextLine();

        System.out.println("Nhap ho ten khach hang:");
        hoTen  = scanner.nextLine();

        System.out.println("Ngay ra hoa don:");
        ngayRaHoaDon = scanner.nextLine();

        System.out.println("Nhap so luong:");
        soLuong = scanner.nextInt();

        System.out.println("Nhap don gia:");
        donGia = scanner.nextFloat();
    }
}

