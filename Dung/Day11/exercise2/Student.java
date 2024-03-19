package day11.exercise2;

import java.util.Scanner;

public class Student {
    static Scanner scanner = new Scanner(System.in);


    private long maSinhVien;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;

    public long getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(long maSinhVien) {
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

    public Student() {
    }

    public Student(long maSinhVien, String hoTen, String diaChi, String soDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien=" + maSinhVien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }

    public void nhapThongTin(Student student) {
        System.out.print("Nhap ma so sinh vien: ");
        student.setMaSinhVien(scanner.nextInt());

        System.out.print("Nhap ho ten: ");
        student.setHoTen(scanner.nextLine());

        System.out.print("Nhap dia chi: ");
        student.setDiaChi(scanner.nextLine());

        String sdt;
        do {
            System.out.print("Nhap so dien thoai gom 7 chu so: ");
            sdt = scanner.nextLine();
            student.setSoDienThoai(sdt);
        } while (!sdt.matches("\\s*\\d{7}\\s*"));
    }
}
