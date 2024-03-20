package exercise8;

import java.util.Scanner;

public class KhachHang {
    Scanner scanner = new Scanner(System.in);
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoasDon;
    protected Integer soLuong;
    protected Float donGia;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String ngayRaHoasDon, Integer soLuong, Float donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoasDon = ngayRaHoasDon;
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

    public String getNgayRaHoasDon() {
        return ngayRaHoasDon;
    }

    public void setNgayRaHoasDon(String ngayRaHoasDon) {
        this.ngayRaHoasDon = ngayRaHoasDon;
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
                ", ngayRaHoasDon=" + ngayRaHoasDon +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
    public  Double thanhTien(){
        return ( double ) ( soLuong * donGia );
    }
    /**
     * ham nhap
     */
    public void nhapThongTinKhachHang() {
        System.out.print("Nhap ma khach hang: ");
        maKhachHang = scanner.nextLine();
        
        System.out.print("Nhap ho ten khach hang: ");
        hoTen = scanner.nextLine();
        
        System.out.print("Nhap ngay ra hoa don: ");
        ngayRaHoasDon = scanner.nextLine();
        
        System.out.print("Nhap so luong( so KW tieu thu): ");
        soLuong = scanner.nextInt();
        
        System.out.print(" Nhap don gia: ");
        donGia = scanner.nextFloat();
    }

    /**
     * ham xuat
     */
    public void hienThiThongTinKhachHang(){
        System.out.println("Ma khach hang: " + maKhachHang);
        System.out.println(" Ten khach hang: " + hoTen);
        System.out.println(" Ngay ra hoa don: " + ngayRaHoasDon);
        System.out.println(" So KW tieu thu: " + soLuong);
    }
    
}