package exercise5;

import java.util.Scanner;

public class ChuyenXe{
    Scanner scanner = new Scanner(System.in);
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected int soXe;
    protected double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

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

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "exercise5.ChuyenXe{" +
                "maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTaiXe='" + hoTenTaiXe + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }

    /**
     * ham nhap thong tin
     */
    public void nhapThongTinChuyenXe() {
        System.out.print("Nhap ma so chuyen: ");
        maSoChuyen = scanner.nextLine();

        System.out.print("Nhap ho ten tai xe: ");
        hoTenTaiXe = scanner.nextLine();

        System.out.print("Nhap so xe: ");
        soXe = scanner.nextInt();

        System.out.print("Nhap doanh thu: ");
        doanhThu = scanner.nextDouble();
    }

}