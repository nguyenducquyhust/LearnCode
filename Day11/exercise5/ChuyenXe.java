package Day12.exercise5;

import java.util.Scanner;

public class ChuyenXe {
   static Scanner scanner = new Scanner(System.in);

    private String maSoChuyen;
    private String hoTenTaiXe;
    private int soXe;
    private long doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, int soXe, long doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }


    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        ChuyenXe.scanner = scanner;
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

    public long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(long doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhapThongTin() {
        System.out.println("Nhap ma so chuyen xe : ");
        maSoChuyen = scanner.nextLine();

        System.out.println(" Nhap ten tai xe : ");
        hoTenTaiXe = scanner.nextLine();

        System.out.println("Nhap bien so xe : ");
        soXe = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Nhap doanh thu ");
        doanhThu = scanner.nextLong();
    }
}
