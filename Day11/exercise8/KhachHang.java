package Day12.exercise8;

import java.time.LocalDate;
import java.util.Scanner;

public class KhachHang {
    static Scanner scanner = new Scanner(System.in);
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoaDon;
    protected Integer soLuong;
    protected Float donGia;


    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String ngayRaHoaDon, Integer soLuong, Float donGia) {
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

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
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
        return "KhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayRaHoaDon=" + ngayRaHoaDon +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    public double thanhTien()  {
        return donGia * soLuong;
    }

   public static int nhapSoLuongKhachhang() {
        System.out.println("Nhap so luong Khach hang");
        int n = scanner.nextInt();
        scanner.nextLine();
        //kiem tra số lượng > 0 thì hợp lệ
        if(n > 0) {
            return n;
        } else {
            System.out.println("So luong ko hop le");
        }
        return n;
    }


}
