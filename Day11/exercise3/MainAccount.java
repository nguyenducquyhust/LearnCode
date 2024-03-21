package exercise3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static exercise3.Account.scanner;


public class MainAccount {
    public static void main(String[] args) {
        int chon = 0;

            System.out.println("---------------------------Menu------------------------");
            System.out.println("| chon 1 : xuat thong tin khach hang                  |");
            System.out.println("| chon 2 : nap tien vao tai khoan                     |");
            System.out.println("| chon 3 : rut tien                                   |");
            System.out.println("| chon 4 : Dao han tai khoan ngan hang                |");
            System.out.println("| chon 5 : chuyen khoan                               |");
            System.out.println("| chon 6 : thoat chuong trinh                         |");
            System.out.println("<<--------------------------------------------------->>");

            Account account = new Account();

            // 1. nhap so luong khach hang
            int n = nhapSoLuongKH();

            // 2. nhap 1 danh sach khach hang
            ArrayList<Account> danhSachKH = nhapDSKH(n);

        // hienThiDanhSach(danhSachKH);


            while (chon != 6) {

                System.out.println("Nhap so tu 1 -> 6 de chon chuong trinh");
                chon = scanner.nextInt();
                System.out.println("-----------------------------------");

                switch (chon) {

                    case 1: {
                    hienThiDanhSach(danhSachKH);
                        break;
                    }

                    case 2: {
                        System.out.println("Nhap stk can nap tien");
                        Long stk = scanner.nextLong();
                        Account account1 = timKiemKH(danhSachKH,stk);
                        account1.napTienTK(account1);
                    }
                }
            }

        }

        /**
         * hàm nhập số lượng khách hàng
         * @return
         */
        public static int nhapSoLuongKH() {
            System.out.println("Nhap so luong khach hang");
            int n = scanner.nextInt();

            //kiem tra số lượng > 0 thì hợp lệ
            if(n > 0) {
                return n;
            } else {
                System.out.println("So luong ko hop le");
            }
            return n;
        }

        /**
         * hàm nhập danh sách KH
         * @param
         * @return
         */
        public static ArrayList<Account> nhapDSKH(int n) {
            ArrayList<Account> danhSachAccount = new ArrayList<>();
           Scanner scanner1 = new Scanner(System.in);
            for (int i = 1; i <= n; i++) {
                System.out.println("Khach hang thu " + i);
                scanner.nextLine();
                Account account = new Account();
                account.nhapAccount();
                danhSachAccount.add(account);

                // System.out.println("Nhap so tai khoan : ");
////                long soTaiKhoan = scanner1.nextLong();
////                scanner1.nextLine();
////
////                System.out.println("Nhap ten tai khoan : ");
////                String tenTaiKhoan = scanner1.nextLine();
////
////                System.out.println("Nhap so tien trong tai khoan : ");
////                double soTienTaiKhoan = scanner1.nextDouble();
////
////                danhSachAccount.add(new Account(soTaiKhoan,tenTaiKhoan,soTienTaiKhoan));
            }
            return danhSachAccount;
        }

    public static void hienThiDanhSach(ArrayList<Account> danhSach) {

        for (Account account: danhSach) {
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(account.getSoTienTrongTK());

            System.out.printf("%-10d %-20s %-20s \n", account.getSoTaikhoan(), account.getTenTaiKhoan(), str1);
        }
    }

        public static Account timKiemKH(ArrayList<Account> danhSach, Long stk) {

            for (Account account: danhSach) {
                if (stk.equals(account.getSoTaikhoan())) {
                    return account;
                } else {
                    System.out.println("Khong tim thay tai khoan nao");
                }
            }
            return null;
        }
    }



