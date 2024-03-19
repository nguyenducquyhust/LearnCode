package day11.exercise3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long stk;
    private String tenTaiKhoan;
    private double soTienTrongTK;
    static final double LAI_XUAT = 0.035;

    static Scanner scanner = new Scanner(System.in);

    public Account(long stk, String tenTaiKhoan, double soTienTrongTK) {
        this.stk = stk;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTK = soTienTrongTK;
    }

    public Account(long stk, String tenTaiKhoan) {
        this.stk = stk;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTK = 50;
    }


    public Account() {
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTK() {
        return soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }

    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String soTienTheoDinhDang = currencyEN.format(soTienTrongTK);
        return "Account{" +
                "stk=" + stk +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", tienTrongTK=" + soTienTheoDinhDang +
                '}';
    }

    /**
     * ham nap tien vao tai khoan
     * @param account
     */
    public void napTienTK(Account account) {
        System.out.print("Nhap so tien can nap: ");
        long soTienCanNap = scanner.nextLong();

        if (soTienCanNap >= 0) {
            double soTienTrongTKSauKhiNap = soTienCanNap + account.getSoTienTrongTK();
            // gan so tien sau khi nap vao tai khoan
            account.setSoTienTrongTK(soTienTrongTKSauKhiNap);

            // dinh dang so tien in ra man hinh
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String soTienTheoDinhDang = currencyEN.format(account.getSoTienTrongTK());
            System.out.println("Ban vua nap " + soTienTheoDinhDang + " vao tai khoan");
        } else {
            System.out.println("So tien nap vao khong hop le");
        }
    }

    /**
     * ham rut tien tu tai khoan
     * @param account
     */
    public void rutTienTK(Account account) {
        System.out.println("Nhap so tien can rut: ");
        long soTienCanRut = scanner.nextLong();
        long phiRutTien = 10;

        if (soTienCanRut >= 0 && soTienCanRut <= account.getSoTienTrongTK() - phiRutTien) {
            double soTienSauKhiRut = account.getSoTienTrongTK();
            account.setSoTienTrongTK(soTienSauKhiRut);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String soTienTheoDinhDang = currencyEN.format(account.getSoTienTrongTK());

            System.out.println("Ban vua rut " + soTienTheoDinhDang + " ra tai khoan");


        } else {
            System.out.println("So tien muon rut khong hop le");
        }
    }

    /**
     * ham dao han lai suat
     * @param account
     */
    public void daoHanLaiSuat(Account account) {
        if (account.getSoTienTrongTK() > 0) {
            double soTienSauDaoHan = account.getSoTienTrongTK() * (LAI_XUAT + 1);
            account.setSoTienTrongTK(soTienSauDaoHan);

            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String soTienTheoDinhDang = currencyEN.format(account.getSoTienTrongTK());
            System.out.println("Ban vua duoc " + soTienTheoDinhDang + " sau dao han");
        } else {
            System.out.println("So tien trong tai khoan khong du");
        }
    }

    /**
     * ham nhap thong tin
     */
    public void nhapThongTin() {
        System.out.print("Nhap so tai khoan: ");
        this.stk = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Nhap ten tai khoan: ");
        this.tenTaiKhoan = scanner.nextLine();

        do {
            System.out.print("Nhap so tien trong tai khoan: ");
            this.soTienTrongTK = scanner.nextDouble();
        } while (this.soTienTrongTK < 0);
    }
}
