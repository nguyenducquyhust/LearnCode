package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class SachUtil {
    static Scanner scanner = new Scanner(System.in);


    /**
     * ham nhap sach
     * @param sachGiaoKhoas
     * @param sachThamKhaos
     */
    public static void nhapSach(ArrayList<SachGiaoKhoa> sachGiaoKhoas, ArrayList<SachThamKhao> sachThamKhaos) {
        System.out.println(" Nhap thong tin sach giao khoa *");

        int n;
        do {
            System.out.print("Nhap so luong sach giao khoa: ");
            n = scanner.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            System.out.println(" Nhap thong tin sach thu " + i + ": ");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            sachGiaoKhoas.add(sachGiaoKhoa);
        }

        System.out.println(" Nhap thong tin sach tham khao *");

        int m;
        do {
            System.out.print("Nhap so luong sach tham khao: ");
            m = scanner.nextInt();
        } while (m < 0);

        for (int i = 1; i <= n; i++) {
            System.out.println("- Nhap thong tin sach thu " + i + ": ");
           SachThamKhao sachThamKhao = new SachThamKhao();
           sachThamKhao.nhapSach();
           sachThamKhaos.add(sachThamKhao);
        }
    }


    /**
     * xuat thong tin
     * @param sachGiaoKhoas
     * @param sachThamKhaos
     */
    public static void xuatThongTin(ArrayList<SachGiaoKhoa> sachGiaoKhoas, ArrayList<SachThamKhao> sachThamKhaos) {
        System.out.println(" Sach giao khoa ");
        for (int i = 0; i < sachGiaoKhoas.size(); i++) {
            System.out.println(" Sach thu " + (i + 1) + ": " + sachGiaoKhoas.get(i).toString());
        }

        System.out.println(" Sach tham khao ");
        for (int i = 0; i < sachThamKhaos.size(); i++) {
            System.out.println(" Sach thu " + (i + 1) + ": " + sachThamKhaos.get(i).toString());
        }
    }

    /**
     * tinh tien
     * @param sachGiaoKhoas
     * @param sachThamKhaos
     */
    public static void thanhTien(ArrayList<SachGiaoKhoa> sachGiaoKhoas, ArrayList<SachThamKhao> sachThamKhaos) {
        long sumSachGiaoKhoa = 0;
        for (SachGiaoKhoa sachGiaoKhoa : sachGiaoKhoas) {
            String tinhTrang = sachGiaoKhoa.getTinhTrang();
            sumSachGiaoKhoa += sachGiaoKhoa.thanhTien(tinhTrang, sachGiaoKhoa);
        }

        long sumSachThamKhao = 0;
        for (SachThamKhao sachThamKhao : sachThamKhaos) {
            double thue = sachThamKhao.getThue();
            sumSachThamKhao += sachThamKhao.thanhTien(thue, sachThamKhao);
        }

        System.out.print("Tong thanh tien cua sach giao khoa: " + sumSachGiaoKhoa);
        System.out.print("Tong thanh tien cua sach tham khao: " + sumSachThamKhao);
    }

    /**
     * trung binh don gia cua sach tham khao
     * @param sachThamKhaos
     */
    public static void trungBinhDonGia(ArrayList<SachThamKhao> sachThamKhaos) {
        double trungBinh = 0;
        for (SachThamKhao sachThamKhao : sachThamKhaos) {
            trungBinh += sachThamKhao.getDonGia();
        }

        System.out.println("Trung binh cong don gia cua sach tham khao la: " + trungBinh / sachThamKhaos.size());
    }

    /**
     * xuat ra sach co nha xuat ban
     * @param sachGiaoKhoas
     */
    public static void nhaXuatBan(ArrayList<SachGiaoKhoa> sachGiaoKhoas) {
        System.out.print("Nhap nha xuat ban: ");
        String nhaXuatBan = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < sachGiaoKhoas.size(); i++) {
            if (nhaXuatBan.equals(sachGiaoKhoas.get(i).getNhaXuatBan())) {
                check = true;
                System.out.println("- Sach thu " + (i + 1) + ": " + sachGiaoKhoas.get(i).toString());
            }
        }

        if (!check) {
            System.out.println("Khong co sach giao khoa nao co nha xuat ban la: " + nhaXuatBan);
        }
    }
}
