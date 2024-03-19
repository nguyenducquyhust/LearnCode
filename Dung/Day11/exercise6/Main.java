package day11.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

import static day11.exercise6.HieuSach.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("--------------------------------Menu---------------------------");
        System.out.println("| Chon 1: Nhap xuat danh sach cac loai sach                   |");
        System.out.println("| Chon 2: Tinh tong thanh tien tung loai sach                 |");
        System.out.println("| Chon 3: Tinh trung binh cong don gia cua cac sach tham khao |");
        System.out.println("| Chon 4: Xuat ra cac sach giao khoa cua nha xuat ban X       |");
        System.out.println("| Chon 5: Thoat chuong trinh                                  |");
        System.out.println("<<----------------------------------------------------------->>");

        ArrayList<SachGK> sachGKS = new ArrayList<>();
        ArrayList<SachTK> sachTKS = new ArrayList<>();

        boolean check = false;
        while (true) {
            System.out.print("Nhap lua chon: ");
            int option = scanner.nextInt();
            if (option == 1) {
                check = true;
                nhapSach(sachGKS, sachTKS);
                xuatThongTin(sachGKS, sachTKS);
            } else if (option == 5) {
                System.exit(0);
                break;
            }

            if (check) {
                switch (option) {
                    case 2:
                        tongThanhTien(sachGKS, sachTKS);
                        break;
                    case 3:
                        trungBinhDonGia(sachTKS);
                        break;
                    case 4:
                        option4(sachGKS);
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
