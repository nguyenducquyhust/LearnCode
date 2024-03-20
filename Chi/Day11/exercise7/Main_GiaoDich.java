package exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_GiaoDich {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--------------------------------Menu---------------------------");
        System.out.println("| Chon 1: Nhap xuat danh sach cac giao dich                   |");
        System.out.println("| Chon 2: Tinh tong so luong cho tung loai giao dich          |");
        System.out.println("| Chon 3: Tinh trung binh thanh tien cua giao dich tien te    |");
        System.out.println("| Chon 4: Xuat ra cac giao dich co don gia lon hon 1 ty       |");
        System.out.println("| Chon 5: Thoat chuong trinh                                  |");
        System.out.println("<<----------------------------------------------------------->>");

        ArrayList<GiaoDichVang> giaoDichVangs = new ArrayList<>();
        ArrayList<GiaoDichTienTe> giaoDichTienTes = new ArrayList<>();

        boolean check = false;
        while (true) {
            System.out.print("Nhap lua chon: ");
            int option = scanner.nextInt();
            if (option == 1) {
                GiaoDichService.nhapGiaoDichVang(giaoDichVangs);
                GiaoDichService.nhapGiaoDichTienTe(giaoDichTienTes);
                GiaoDichService.xuatGiaoDichVang(giaoDichVangs);
                GiaoDichService.xuatGiaoDichTienTe(giaoDichTienTes);
                check = true;

            } else if (option == 5) {
                System.exit(0);
                break;
            }

            if (check) {
                switch (option) {
                    case 2:
                        GiaoDichService.tongSoLuongGiaoDichVang(giaoDichVangs);
                        GiaoDichService.tongSoLuongGiaoDichTienTe(giaoDichTienTes);
                        break;
                    case 3:
                        GiaoDichService.trungBinhThanhTien(giaoDichTienTes);
                        break;
                    case 4:
                        GiaoDichService.donGiaHon1TyVang(giaoDichVangs);
                        GiaoDichService.donGiaHon1TyTienTe(giaoDichTienTes);
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

