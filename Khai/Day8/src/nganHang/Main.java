package nganHang;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //nhap danh sach kh
        ArrayList<Account> danhSachKh = new ArrayList<>();
        danhSachKh = hamNhapDanhSachKhachHang();

        //menu
        System.out.println("---------------------------Menu------------------------");
        System.out.println("| chon 1 : xuat thong tin khach hang                  |");
        System.out.println("| chon 2 : nap tien vao tai khoan                     |");
        System.out.println("| chon 3 : rut tien                                   |");
        System.out.println("| chon 4 : Dao han tai khoan ngan hang                |");
        System.out.println("| chon 5 : chuyen khoan                               |");
        System.out.println("| chon 6 : thoat chuong trinh                         |");
        System.out.println("<<--------------------------------------------------->>");

        //choice
        int choice = 0;
        while (choice >= 0 && choice <= 6) {
            System.out.println("Nhập số từ 1 - 6 để thực hiện thao tác trong menu:");
            choice = scanner.nextInt();
            switch (choice) {

                case 1: {
                    hienThiDsKh(danhSachKh);
                    break;
                }

                case 2: {
                    boolean valid = true;
                    while (valid){
                        System.out.println("Nhap stk can nap tien: ");
                        Long stk = scanner.nextLong();
                        Account account = timTk(danhSachKh, stk);
                        if (stk.equals(account.getsTK())){
                            account.napTienTk(account);
                            valid = false;
                        }else {
                            valid = true;
                        }
                    }
                    break;
                }

                case 3: {
                    boolean valid1 = true;
                    while (valid1){
                        System.out.println("Nhập stk cần rút tien: ");
                        Long stk = scanner.nextLong();
                        Account account = timTk(danhSachKh, stk);
                        if (stk.equals(account.getsTK())){
                            account.rutTienTk(account);
                            valid1 = false;
                        }else {
                            valid1 = true;
                        }
                    }
                    break;
                }

                case 4: {
                    boolean valid2 = true;
                    while (valid2){
                        System.out.println("Nhập stk cần truy vấn đáo hạn: ");
                        Long stk = scanner.nextLong();
                        Account account = timTk(danhSachKh, stk);
                        if (stk.equals(account.getsTK())){
                            account.daoHanLaiXuat(account);  // chưa hiểu lắm về cách gọi hàm và truyền hàm
                            valid2 = false;
                        }else {
                            valid2 = true;
                        }
                    }
                    break;
                }

                case 5: {
                    chuyenTien(danhSachKh);
                    break;
                }
                case 6: {
                    System.out.println("Đã thoát chương trình!");
                    System.exit(0);
                }
            }
        }


    }

    // hàm kiểm tra các thong tin có bị trùng không
    public static boolean kiemTraTaiKhoanTrung(ArrayList<Account> danhSachKH, Account account) {
        for (Account existingAccount : danhSachKH) {
            if (existingAccount.getTenTk().equals(account.getTenTk()) || existingAccount.getsTK()==(account.getsTK())) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Account> hamNhapDanhSachKhachHang() {
        ArrayList<Account> danhSachKH = new ArrayList<Account>();
        System.out.println("nhập số lượng khách hàng: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        for (int i = 1; i <= n; i++) {
            System.out.println("nhập khách hàng thứ " + i);
            Account account = new Account();
            account.inputKH();
            while (kiemTraTaiKhoanTrung(danhSachKH, account)) {
                System.out.println("Tài khoản đã tồn tại. Vui lòng nhập lại.");
                account = new Account();
                account.inputKH();
            }
            danhSachKH.add(account);
        }
        return danhSachKH;
    }

    // hàm hiển thij danh sach kh
    public static void hienThiDsKh(ArrayList<Account> danhSachLinhTinh) {
        for (Account account : danhSachLinhTinh) {
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(account.getSoTienTrongTk());

            System.out.printf("%-10d %-20s %-20s \n", account.getsTK(), account.getTenTk(), str1);
        }
    }

    //ham tim kh
    public static Account timTk(ArrayList<Account> danhSach, Long stk) {
        boolean valid = true;
            for (Account account: danhSach) {
                if (stk.equals(account.getsTK())){
                    System.out.println("Đã tìm thấy tài khoản!");
                    valid = false;
                    return account;
                }else {
                    valid = true;
                }
            }
            if (valid){
                System.out.println("không tìm thầy tk nào, vui lòng nhập lại!");
            }

        return new Account();
    }
    public static void chuyenTien(ArrayList<Account> danhSachKh ){
        boolean valid1 = true;
        long soTienCanChuyen = 0;
        while (valid1){
            System.out.println("Nhập stk để truy cập: ");
            Long stk = scanner.nextLong();
            Account account = timTk(danhSachKh, stk);
            if (stk.equals(account.getsTK())){
                System.out.println("Truy cập vào tk " + account.getTenTk() + " thành công!");
                boolean duTienKhong = true;
                while (duTienKhong){
                    System.out.println("Nhập số tiền cần chuyển");
                    soTienCanChuyen = scanner.nextLong();
                    double soTienTrongTkSauKhiChuyen = 0;
                    if (account.getSoTienTrongTk()>= soTienCanChuyen){
                        soTienTrongTkSauKhiChuyen = account.getSoTienTrongTk() - soTienCanChuyen;
                        account.setSoTienTrongTk(soTienTrongTkSauKhiChuyen);
                        duTienKhong = false;
                    }else {
                        System.out.println("Số tiền trong tài khoản không đủ! ");
                        duTienKhong = true;
                    }
                }

                valid1 = false;
            }else {
                valid1 = true;
            }
        }
        boolean valid2 =true;
        while (valid2){
            System.out.println("Nhập stk thụ hưởng: ");
            Long stkThuHuong = scanner.nextLong();
            Account account = timTk(danhSachKh, stkThuHuong);
            if (stkThuHuong.equals(account.getsTK())){
                double soTienTrongTkSauKhiThuHuong = 0;
                if (account.getSoTienTrongTk()>=0){
                    soTienTrongTkSauKhiThuHuong = soTienCanChuyen + account.getSoTienTrongTk();
                    account.setSoTienTrongTk(soTienTrongTkSauKhiThuHuong);
                    System.out.println("Tài khoản của " + account.getTenTk() + " vừa được cộng "  + soTienCanChuyen + " vào tài khoản!");
                    System.out.println("Số dư của tk là: "+ soTienTrongTkSauKhiThuHuong);
                }else {

                }
                valid2 = false;
            }else {
                valid2 = true;
            }
        }
    }



}
