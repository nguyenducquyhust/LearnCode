package day11.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class HieuSach {
    static Scanner scanner = new Scanner(System.in);


    /**
     * nhap danh sach sach
     * @param sachGKS
     * @param sachTKS
     */
    public static void nhapSach(ArrayList<SachGK> sachGKS, ArrayList<SachTK> sachTKS) {
        System.out.println("* Nhap thong tin sach giao khoa *");

        int n;
        do {
            System.out.print("Nhap so luong sach giao khoa: ");
            n = scanner.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            System.out.println("- Nhap thong tin sach thu " + i + ": ");
            SachGK sachGK = new SachGK();
            sachGK.nhapThongTin();
            sachGKS.add(sachGK);
        }

        System.out.println("\n* Nhap thong tin sach tham khao *");

        int m;
        do {
            System.out.print("Nhap so luong sach tham khao: ");
            m = scanner.nextInt();
        } while (m < 0);

        for (int i = 1; i <= n; i++) {
            System.out.println("- Nhap thong tin sach thu " + i + ": ");
            SachTK sachTK = new SachTK();
            sachTK.nhapThongTin();
            sachTKS.add(sachTK);
        }
    }


    /**
     * xuat thong tin cac loai sach
     * @param sachGKS
     * @param sachTKS
     */
    public static void xuatThongTin(ArrayList<SachGK> sachGKS, ArrayList<SachTK> sachTKS) {
        System.out.println("* SACH GIAO KHOA *");
        for (int i = 0; i < sachGKS.size(); i++) {
            System.out.println("- Sach thu " + (i + 1) + ": " + sachGKS.get(i).toString());
        }

        System.out.println("\n* SACH THAM KHAO *");
        for (int i = 0; i < sachTKS.size(); i++) {
            System.out.println("- Sach thu " + (i + 1) + ": " + sachTKS.get(i).toString());
        }
    }

    /**
     * option 2: tong thanh tien cua 2 loai sach
     * @param sachGKS
     * @param sachTKS
     */
    public static void tongThanhTien(ArrayList<SachGK> sachGKS, ArrayList<SachTK> sachTKS) {
        long sumSGK = 0;
        for (SachGK sachGK : sachGKS) {
            String tinhTrang = sachGK.getTinhTrang();
            sumSGK += sachGK.thanhTien(tinhTrang, sachGK);
        }

        long sumSTK = 0;
        for (SachTK sachTK : sachTKS) {
            int thue = sachTK.getThue();
            sumSTK += sachTK.thanhTien(thue, sachTK);
        }

        System.out.print("- Tong thanh tien cua sach giao khoa: " + sumSGK);
        System.out.print("- Tong thanh tien cua sach tham khao: " + sumSTK);
    }

    /**
     * trung binh don gia cua sach tham khao
     * @param sachTKS
     */
    public static void trungBinhDonGia(ArrayList<SachTK> sachTKS) {
        double trungBinh = 0;
        for (SachTK sachTK : sachTKS) {
            trungBinh += sachTK.getDonGia();
        }

        System.out.println("Trung binh cong don gia cua sach tham khao la: " + trungBinh / sachTKS.size());
    }

    /**
     * xuat ra cac sach giao khoa co nha xuat ban X
     * @param sachGKS
     */
    public static void option4(ArrayList<SachGK> sachGKS) {
        System.out.print("Nhap nha xuat ban: ");
        String nxb = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < sachGKS.size(); i++) {
            if (nxb.equals(sachGKS.get(i).getNhaXuatBan())) {
                check = true;
                System.out.println("- Sach thu " + (i + 1) + ": " + sachGKS.get(i).toString());
            }
        }

        if (!check) {
            System.out.println("Khong co sach giao khoa nao co nha xuat ban la: " + nxb);
        }
    }
}
