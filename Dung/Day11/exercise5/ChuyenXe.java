package day11.exercise5;

import java.util.Scanner;

public class ChuyenXe {
    static Scanner scanner = new Scanner(System.in);


    private String maSoChuyen;
    private String hoTenTaiXe;
    private int soXe;
    private long doanhThu;

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(long doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" +
                "maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTaiXe='" + hoTenTaiXe + '\'' +
                ", soXe=" + soXe +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public void nhapThongTin() {
        System.out.print("Nhap ma so chuyen: ");
        this.maSoChuyen = scanner.nextLine();
        System.out.print("Nhap ho ten tai xe: ");
        this.hoTenTaiXe = scanner.nextLine();
        System.out.print("Nhap so xe: ");
        this.soXe = scanner.nextInt();
        System.out.print("Nhap doanh thu: ");
        this.doanhThu = scanner.nextInt();
    }
}
