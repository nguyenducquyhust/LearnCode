package nganHang;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long sTK;
    private String tenTk;
    private double soTienTrongTk = 50;
    final double laiXuat = 0.035;


    public Account(long sTK, String tenTk, double soTienTrongTk) {
        this.sTK = sTK;
        this.tenTk = tenTk;
        this.soTienTrongTk = soTienTrongTk;
    }
    public Account(){

    }

    public long getsTK() {
        return sTK;
    }

    public void setsTK(long sTK) {
        this.sTK = sTK;
    }

    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    public double getSoTienTrongTk() {
        return soTienTrongTk;
    }

    public void setSoTienTrongTk(double soTienTrongTk) {
        this.soTienTrongTk = soTienTrongTk;
    }

    @Override
    public String toString() {
        return "Account{" +
                "sTK=" + sTK +
                ", tenTk='" + tenTk + '\'' +
                ", soTienTrongTk=" + soTienTrongTk +
                '}';
    }
    public void napTienTk(Account account){
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        while (valid){
            System.out.println("Nhap so tien can nap: ");
            long soTienCanNap = scanner.nextLong();
            // neu >0 hop le
            if (soTienCanNap > 0){
                double soTienTrongTkSauKhiNap = soTienCanNap + account.getSoTienTrongTk();
                account.setSoTienTrongTk(soTienTrongTkSauKhiNap);
                // dinh dang so tien can nap
                NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
                String soTienTheoDinhDang = currencyEN.format(account.getSoTienTrongTk());
                System.out.println("Bạn đã nạp "+ soTienCanNap + "đ");
                System.out.println("Số dư tk của bạn sau khi nạp là: " + soTienTrongTkSauKhiNap + "đ");
                valid = false;
            }else {
                System.out.println("So tien can nap khong hop le!");
                valid = true;
            }
        }

    }
    public void rutTienTk(Account account){
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        while (valid){
            System.out.println("Nhập số tiền cần rút: ");
            long soTienCanRut = scanner.nextLong();
            long phiRutTien = 10;
            if (soTienCanRut > 0 && soTienCanRut <= account.getSoTienTrongTk() - phiRutTien){
                double soTienTrongTkSauKhiRut = account.getSoTienTrongTk() - soTienCanRut - phiRutTien;
                account.setSoTienTrongTk(soTienTrongTkSauKhiRut);
                System.out.println("Bạn đã rút " + soTienCanRut + " với phí rút tiền là 10đ");
                System.out.println("Tài khoản của bạn còn lại "+ soTienTrongTkSauKhiRut + "đ");
                valid = false;
            }else {
                System.out.println("Số tiền muốn rút không hợp lệ!");
                valid = true;
            }
        }

    }
    public void daoHanLaiXuat(Account account){
        if (account.getSoTienTrongTk() > 0){
            double soTienSauLai = account.getSoTienTrongTk() + (account.getSoTienTrongTk()*laiXuat);
            account.setSoTienTrongTk(soTienSauLai);
            System.out.println("Ban vua duoc cong " + soTienSauLai + "sau dao han!");
        }else {
            System.out.println("So tien trong tk khong du de nhan lai");
        }
    }
    public void inputKH(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tài khoản: ");
        String tenTK = scanner.nextLine();
        setTenTk(tenTK);

        System.out.println("Nhập số tài khoản:");
        long soTK = scanner.nextLong();
        setsTK(soTK);

    }
    public void showInfo(){
        System.out.println(toString());
    }



}