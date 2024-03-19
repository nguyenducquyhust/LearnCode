package day11.exercise3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("----------------------Menu--------------------");
        System.out.println("| Chon 1: Xuat thong tin khach hang          |");
        System.out.println("| Chon 2: Nap tien vao tai khoan             |");
        System.out.println("| Chon 3: Rut tien                           |");
        System.out.println("| Chon 4: Dao han tai khoan ngan hang        |");
        System.out.println("| Chon 5: Chuyen khoan                       |");
        System.out.println("| Chon 6: Thoat chuong trinh                 |");
        System.out.println("<<------------------------------------------>>");

        ArrayList<Account> accounts = new ArrayList<>();

        boolean check = false;
        while (true) {
            System.out.print("\nNhap lua chon: ");
            int option = scanner.nextInt();

            if (check) {
                switch (option) {
                    case 2:
                        Bank.napTien(accounts);
                        break;
                    case 3:
                        Bank.rutTien(accounts);
                        break;
                    case 4:
                        Bank.daoHan(accounts);
                        break;
                    case 5:
                        Bank.chuyenKhoan(accounts);
                        break;
                    default:
                        System.out.println("Nhap lai");
                        break;
                }
            } else if (option == 6) {
                System.exit(0);
                break;
            } else if (option == 1) {
                Bank.nhapDanhSach(accounts);
                Bank.xuatDanhSach(accounts);
                check = true;
            } else {
                System.out.println("Chua nhap thong tin. Nhap lai");
            }
        }
    }
}
