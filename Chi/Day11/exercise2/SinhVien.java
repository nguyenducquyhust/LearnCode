package exercise2;

import java.util.Scanner;

public class SinhVien{
    static Scanner scanner = new Scanner(System.in);
    private  int maSinhVien;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    // khoi tao constructor mac dinh
    public SinhVien() {
    }
    // khoi tao constructor co tham so

    public SinhVien(int maSinhVien, String hoTen, String diaChi, String soDienThoai) {
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

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    @Override
    public String toString() {
        return "exercise2.SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
    public void nhapThongTin() {
        System.out.print("Nhap ma sinh vien: ");
        int MaSinhVien = scanner.nextInt();


        System.out.print("Nhap ho ten: ");
        String HoTen = scanner.nextLine();


        System.out.println(" Nhap dia chi: ");
        String DiaChi = scanner.nextLine();


        System.out.println(" Nhap sdt; ");
        String SoDienThoai = scanner.nextLine();

    }
}