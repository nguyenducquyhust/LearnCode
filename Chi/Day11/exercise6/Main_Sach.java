package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Sach {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--------------------------------Menu---------------------------");
        System.out.println("| Chon 1: Nhap xuat danh sach cac loai sach                   |");
        System.out.println("| Chon 2: Tinh tong thanh tien tung loai sach                 |");
        System.out.println("| Chon 3: Tinh trung binh cong don gia cua cac sach tham khao |");
        System.out.println("| Chon 4: Xuat ra cac sach giao khoa cua nha xuat ban X       |");
        System.out.println("| Chon 5: Thoat chuong trinh                                  |");
        System.out.println("<<----------------------------------------------------------->>");

        ArrayList<SachGiaoKhoa> sachGiaoKhoas = new ArrayList<>();
        ArrayList<SachThamKhao> sachThamKhaos = new ArrayList<>();

        boolean check = false;
        while (true) {
            System.out.print("Nhap lua chon: ");
            int luaChon = scanner.nextInt();
            if (luaChon == 1) {
                check = true;
                SachUtil.nhapSach(sachGiaoKhoas, sachThamKhaos);
                SachUtil.xuatThongTin(sachGiaoKhoas, sachThamKhaos);
            } else if (luaChon == 5) {
                System.exit(0);
                break;
            }

            if (check) {
                switch (luaChon) {
                    case 2:
                        SachUtil.thanhTien(sachGiaoKhoas, sachThamKhaos);
                        break;
                    case 3:
                        SachUtil.trungBinhDonGia(sachThamKhaos);
                        break;
                    case 4:
                        SachUtil.nhaXuatBan(sachGiaoKhoas);
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
