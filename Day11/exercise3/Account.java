package exercise3;

import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;

public class Account {
    public static final double LAISUAT = 0.035;

    private long soTaikhoan;
    private String tenTaiKhoan;
    private double soTienTrongTK = 50;

    public Account() {
    }

    public Account(long soTaikhoan, String tenTaiKhoan, double soTienTrongTK) {
        this.soTaikhoan = soTaikhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTK = soTienTrongTK;
    }
    public Account(long soTaikhoan, String tenTaiKhoan){
        this.soTaikhoan = soTaikhoan;
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public long getSoTaikhoan() {
        return soTaikhoan;
    }

    public void setSoTaikhoan(long soTaikhoan) {
        this.soTaikhoan = soTaikhoan;
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
        return "Account{" +
                "soTaikhoan=" + soTaikhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTienTrongTK=" + soTienTrongTK +
                '}';
    }
    public static Scanner scanner = new Scanner(System.in);

    /**
     * ham nap tien vao tai khoan
     * @param account
     */
    public void napTienTK (Account account ) {

        System.out.println("Nhap so tien can nap la : ");
        long soTienCanNap = scanner.nextLong();

        if (soTienCanNap >= 0 ) {
           double soTienTrongTKSauKhiNap = soTienCanNap + account.getSoTienTrongTK();

            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String soTienTheoDinhDang = currencyEN.format(account.getSoTienTrongTK());
            System.out.println("Ban vua nap " + soTienTheoDinhDang + "vao tai khoan ");
        }else {
            System.out.println("So tien ban vua nap khong hop le !! ");
        }

    }

    public void rutTienTaiKhoan (Account account) {
        System.out.println(" Nhap so tien muon rut : ");
        long soTienCanRut = scanner.nextLong();
        long phiRutTien = 10;

        if (soTienCanRut >= 0 && soTienCanRut <= (account.getSoTienTrongTK() - phiRutTien)) {
            double soTienSauKhiRut = account.getSoTienTrongTK() - soTienCanRut - phiRutTien;

            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String soTienTheoDinhDang = currencyEN.format(soTienSauKhiRut);
            System.out.println("So tien con lai trong tai khoan la : " + soTienTheoDinhDang );
        }
        else {
            System.out.println("So tien muon rut khong hop le");
        }

    }

    public void daoHanLaiSuat (Account account) {
        if (account.getSoTienTrongTK() > 0 ) {
            double sotienSauDaoHan = account.soTaikhoan + account.getSoTienTrongTK() * LAISUAT;

            account.setSoTienTrongTK(sotienSauDaoHan);

            // dinh dang so tien in ra man hinh
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String soTienTheoDinhDang = currencyEN.format(account.getSoTienTrongTK());
            System.out.println("Ban vua duoc" + soTienTheoDinhDang + "sau dao han");

        } else {
            System.out.println("So tien trong tai khoan khong du");
        }

    }

    public void chuyenKhoan (List<Account> danhSachTaiKhoan)  {

//       double nhan;
//       double chuyen;
//       double tienChuyen;

//        System.out.println("nhap so luong khach hang :");
//        int n = scanner.nextInt();

        System.out.println(" Nhap so tai khoan khach hang chuyen tien  : ");
        long soTaiKhoanChuyenTien = scanner.nextLong();

        System.out.println(" Nhap so tai khoan khach hang nhan tien  : ");
        long soTaiKhoanNhanTien = scanner.nextLong();

        System.out.println(" Nhap so tien muon chuyen : ");
        double soTienChuyen = scanner.nextDouble();

        //tim kiem tk nguoi chuyen
        Account taiKhoanChuyen = null;
        for (Account account : danhSachTaiKhoan) {
            if (account.getSoTaikhoan() == soTaiKhoanChuyenTien) {
                taiKhoanChuyen = account;
                break;
            }
        }

        Account taiKhoanNhan = null;
        for (Account account : danhSachTaiKhoan) {
            if (account.getSoTaikhoan() == soTaiKhoanNhanTien) {
                taiKhoanNhan = account;
                break;
            }
        }


        // Kiểm tra xem tài khoản của cả hai người có tồn tại không
        if (taiKhoanChuyen == null) {
            System.out.println(" So tai khoan chuyen nay khon on tai !!! ");
            return;
        }

        if (taiKhoanNhan == null) {
            System.out.println(" so tai khoan nhan tien nay khong ton tai !!!");
            return;
        }

        // Kiểm tra số dư trong tài khoản của người chuyển có đủ để chuyển khoản không
        if (soTienChuyen <= 0 && soTienChuyen > taiKhoanChuyen.getSoTienTrongTK()){
            System.out.println(" So tien trong tai khoan khong du hoac khong hop le !!");
            return;
        }

        // Thực hiện chuyển khoản

        taiKhoanChuyen.setSoTienTrongTK(taiKhoanChuyen.getSoTienTrongTK()- soTienChuyen);
        taiKhoanNhan.setSoTienTrongTK(taiKhoanChuyen.getSoTienTrongTK() + soTienChuyen);

        System.out.println(" Chuyen khoan thanh cong ");
        System.out.println(" Tai khoan nguoi chuyen sau khi chuyen khoan " + taiKhoanChuyen);
        System.out.println(" Tai khoan nguoi nhan sau khi duoc nha tien " + taiKhoanNhan);



        //        double soTienChuyen = scanner.nextDouble();
//       if (soTienChuyen > 0 && soTienChuyen < account.getSoTienTrongTK()) {
//            double soTienHienTai = account.getSoTienTrongTK();
//            soTienHienTai -= soTienChuyen;
//            account.setSoTienTrongTK(soTienHienTai);
//            System.out.println("Chuyen khoan thanh cong.");
//        }else {
//            System.out.println("So tien chuyen khoan khong hop le hoac khong du trong tai khoan.");
//        }



    }
    /**
     * hàm nhập thông tin 1 tài khoản
     * @return
     */
    public void nhapAccount() {

        System.out.println("Nhap ten khach hang");
        String tenTK = scanner.nextLine();
        setTenTaiKhoan(tenTK);

        System.out.println("Nhap stk");
        long soTK = scanner.nextLong();
        setSoTaikhoan(soTK);
    }
    public void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        System.out.printf("%-10d %-20s %-20s \n", soTaikhoan, tenTaiKhoan, str1);
    }



}
