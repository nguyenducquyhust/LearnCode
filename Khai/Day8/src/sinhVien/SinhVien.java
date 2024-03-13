package sinhVien;

import java.util.Scanner;

public class SinhVien {
    private long maSinhVien;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;

    public SinhVien(){}
    public SinhVien(long maSinhVien, String hoTen, String diaChi, String soDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

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

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }
    public void inputSv (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên sinh viên: ");
        String tenSv = scanner.nextLine();
        setHoTen(tenSv);

        System.out.println("Nhập mã sinh viên: ");
        long maSinhVien = scanner.nextLong();
        setMaSinhVien(maSinhVien);
        scanner.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        setDiaChi(diaChi);

        // nhập số điện thoại
        boolean valid3 = true;
        String soDienThoai = null;
        while (valid3){
            System.out.println("Nhập số điện thoại (7 số và bắt đầu bằng số 0): ");
            soDienThoai = scanner.nextLine();
            if (soDienThoai.matches("^0(\\d{2})(\\d{2})(\\d{2})$")){
                System.out.println("Thông tin hợp lệ! ");
                valid3 = false;
            } else {
                System.out.println("Thông tin không hop lệ! Vui lòng nhập lại");
                valid3  =true;
            }
        }
        setSoDienThoai(soDienThoai);
    }
}
