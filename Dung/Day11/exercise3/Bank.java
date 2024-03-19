package day11.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);

    /**
     * ham nhap danh sach tai khoan
     * @param accounts
     */
    public static void nhapDanhSach(ArrayList<Account> accounts) {
        System.out.println("* Nhap thong tin khach hang *");

        System.out.print("\nNhap so luong tai khoan: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n- Nhap thong tin tai khoan thu " + i + ": ");
            Account account = new Account();
            account.nhapThongTin();
            accounts.add(account);
        }
    }

    /**
     * ham xuat thong tin khach hang
     * @param accounts
     */
    public static void xuatDanhSach(ArrayList<Account> accounts) {
        System.out.println("\n* Xuat thong tin khach hang *");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.print((i + 1) + ". " + accounts.get(i).toString());
        }
    }

    /**
     * ham nhap tien vao tai khoan
     * @param accounts
     */
    public static void napTien(ArrayList<Account> accounts) {
        System.out.print("Nhap so tai khoan muon nap tien: ");
        Long soTaiKhoan = scanner.nextLong();

        for (int i = 0; i < accounts.size(); i++) {
            if (soTaiKhoan.equals(accounts.get(i).getStk())) {
                System.out.println(accounts.get(i).toString());
                accounts.get(i).napTienTK(accounts.get(i));
                break;
            } else {
                System.out.println("Khong tim thay tai khoan");
            }
        }
    }

    /**
     * ham rut tien tai khoan
     * @param accounts
     */
    public static void rutTien(ArrayList<Account> accounts) {
        System.out.print("Nhap so tai khoan muon rut tien: ");
        Long soTaiKhoan = scanner.nextLong();

        for (int i = 0; i < accounts.size(); i++) {
            if (soTaiKhoan.equals(accounts.get(i).getStk())) {
                System.out.println(accounts.get(i).toString());
                accounts.get(i).rutTienTK(accounts.get(i));
                break;
            } else {
                System.out.println("Khong tim thay tai khoan");
            }
        }
    }

    /**
     * ham dao han tai khoan ngan hang
     * @param accounts
     */
    public static void daoHan(ArrayList<Account> accounts) {
        System.out.print("Nhap so tai khoan: ");
        Long soTaiKhoan = scanner.nextLong();

        for (int i = 0; i < accounts.size(); i++) {
            if (soTaiKhoan.equals(accounts.get(i).getStk())) {
                System.out.println(accounts.get(i).toString());
                accounts.get(i).daoHanLaiSuat(accounts.get(i));
                break;
            } else {
                System.out.println("Khong tim thay tai khoan");
            }
        }
    }

    public static void chuyenKhoan(ArrayList<Account> accounts) {
        System.out.print("Nhap so tai khoan muon chuyen: ");
        Long stk1 = scanner.nextLong();
        double soTienTrongTK = 0;
        boolean check1 = false;
        int index1 = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (stk1.equals(accounts.get(i).getStk())) {
                check1 = true;
                System.out.println(accounts.get(i).toString());
                soTienTrongTK = accounts.get(i).getSoTienTrongTK();
                index1 = i;
                break;
            }
        }

        boolean check2 = false;
        int index2 = 0;
        System.out.print("\nNhap so tai khoan nhan tien: ");
        Long stk2 = scanner.nextLong();
        for (int i = 0; i < accounts.size(); i++) {
            if (stk2.equals(accounts.get(i).getStk())) {
                check2 = true;
                System.out.println(accounts.get(i).toString());
                index2 = i;
                break;
            }
        }

        if (check1 && check2) {
            while (true) {
                System.out.print("Nhap so tien muon chuyen: ");
                double soTienChuyen = scanner.nextDouble();
                if (soTienChuyen > soTienTrongTK) {
                    System.out.println("So tien chuyen lon hon so tien trong tai khoan. Nhap lai");
                } else {
                    double chuyen = soTienTrongTK - soTienChuyen;
                    double nhan = soTienTrongTK + soTienChuyen;
                    accounts.get(index1).setSoTienTrongTK(chuyen);
                    accounts.get(index2).setSoTienTrongTK(nhan);
                    System.out.println("Da chuyen khoan thanh cong");
                    break;
                }
            }
        }
    }
}
