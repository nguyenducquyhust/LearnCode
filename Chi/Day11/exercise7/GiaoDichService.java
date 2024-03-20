package exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoDichService {
    static Scanner scanner = new Scanner(System.in);

    public static void nhapGiaoDichVang(ArrayList<GiaoDichVang> giaoDichVangs) {
        System.out.println(" Nhap so giao dich vang: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(" Giao dich thu " + i + " : ");
            GiaoDichVang giaoDichVang = new GiaoDichVang();
            giaoDichVang.nhap();
            giaoDichVangs.add(giaoDichVang);

        }
    }

    public static void nhapGiaoDichTienTe(ArrayList<GiaoDichTienTe> giaoDichTienTes) {
        System.out.println(" Nhap so giao dich tien te: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(" Giao dich thu " + i + " : ");
            GiaoDichTienTe giaoDichTienTe = new GiaoDichTienTe();
            giaoDichTienTe.nhap();
            giaoDichTienTes.add(giaoDichTienTe);
        }
    }

    public static void xuatGiaoDichVang(ArrayList<GiaoDichVang> giaoDichVangs) {
        for (int i = 0; i < giaoDichVangs.size(); i++) {
            System.out.println(" Giao dich thu " + (i + 1) + " : " + giaoDichVangs.toString());

        }
    }

    public static void xuatGiaoDichTienTe(ArrayList<GiaoDichTienTe> giaoDichTienTes) {
        for (int i = 0; i < giaoDichTienTes.size(); i++) {
            System.out.println(" Giao dich thu " + (i + 1) + " : " + giaoDichTienTes.toString());

        }
    }

    public static void tongSoLuongGiaoDichVang(ArrayList<GiaoDichVang> giaoDichVangs) {
        int sum = 0;
        for (int i = 0; i < giaoDichVangs.size(); i++) {
            sum += giaoDichVangs.get(i).getSoLuong();
        }
        System.out.println(" Tong so luong giao dich vang la: " + sum);

    }

    public static void tongSoLuongGiaoDichTienTe(ArrayList<GiaoDichTienTe> giaoDichTienTes) {
        int sum = 0;
        for (int i = 0; i < giaoDichTienTes.size(); i++) {
            sum += giaoDichTienTes.get(i).getSoLuong();
        }
        System.out.println(" Tong so luong giao dich tien te la: " + sum);

    }

    public static void trungBinhThanhTien(ArrayList<GiaoDichTienTe> giaoDichTienTes) {
        double sum = 0;
        for (int i = 0; i < giaoDichTienTes.size(); i++) {
            sum += giaoDichTienTes.get(i).getThanhTien();
        }
        System.out.println(" Trung binh thanh tien cua giao dich tien te la: " + sum / (giaoDichTienTes.size()));

    }

    public static void donGiaHon1TyVang(ArrayList<GiaoDichVang> giaoDichVangs) {
        for (int i = 0; i < giaoDichVangs.size(); i++) {
            if (giaoDichVangs.get(i).getDonGia() > 1000000000) {
                System.out.println("Nhung giao dich vang lon hon 1 ty la: " + giaoDichVangs.get(i).toString());
            }
        }
    }

    public static void donGiaHon1TyTienTe(ArrayList<GiaoDichTienTe> giaoDichTienTes) {
        for (int i = 0; i < giaoDichTienTes.size(); i++) {
            if (giaoDichTienTes.get(i).getDonGia() > 1000000000) {
                System.out.println("Nhung giao dich tien te lon hon 1 ty la: " + giaoDichTienTes.get(i).toString());
            }
        }

    }
}
