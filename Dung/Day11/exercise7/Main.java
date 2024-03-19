package day11.exercise7;

import java.util.ArrayList;
import java.util.Scanner;

import static day11.exercise7.GiaoDichService.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("--------------------------------Menu---------------------------");
        System.out.println("| Chon 1: Nhap xuat danh sach cac giao dich                   |");
        System.out.println("| Chon 2: Tinh tong so luong cho tung loai giao dich          |");
        System.out.println("| Chon 3: Tinh trung binh thanh tien cua giao dich tien te    |");
        System.out.println("| Chon 4: Xuat ra cac giao dich co don gia lon hon 1 ty       |");
        System.out.println("| Chon 5: Thoat chuong trinh                                  |");
        System.out.println("<<----------------------------------------------------------->>");

        ArrayList<Vang> vangs = new ArrayList<>();
        ArrayList<TienTe> tienTes = new ArrayList<>();

        boolean check = false;
        while (true) {
            System.out.print("Nhap lua chon: ");
            int option = scanner.nextInt();
            if (option == 1) {
                nhapGiaoDich(vangs, tienTes);
                xuatDanhSach(vangs, tienTes);
                check = true;

            } else if (option == 5) {
                System.exit(0);
                break;
            }

            if (check) {
                switch (option) {
                    case 2:
                        soLuongGiaoDich(vangs, tienTes);
                        break;
                    case 3:
                        trungBinhThanhTien(tienTes);
                        break;
                    case 4:
                        checkDonGia(vangs, tienTes);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Nhap lai");
            }
        }
    }
}
