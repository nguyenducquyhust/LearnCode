package day11.exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoDichService {
    static Scanner scanner = new Scanner(System.in);

    /**
     * nhap thong tin giao dich
     * @param vangs
     */
    public static void nhapGiaoDich(ArrayList<Vang> vangs, ArrayList<TienTe> tienTes) {
        System.out.println("* Nhap thong tin giao dich vang *");

        System.out.print("Nhap so giao dich vang: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n- Nhap thong tin giao dich " + i + ": ");
            Vang vang = new Vang();
            vang.nhapThongTin();
            vangs.add(vang);
        }

        System.out.println("\n* Nhap thong tin giao dich tien te *");

        System.out.print("Nhap so giao dich tien te: ");
        int m = scanner.nextInt();

        for (int i = 1; i <= m; i++) {
            System.out.println("\n- Nhap thong tin giao dich " + i + ": ");
            TienTe tienTe = new TienTe();
            tienTe.nhapThongTin();
            tienTes.add(tienTe);
        }
    }

    /**
     * xuat danh sach cac giao dich
     * @param vangs
     * @param tienTes
     */
    public static void xuatDanhSach(ArrayList<Vang> vangs, ArrayList<TienTe> tienTes) {
        System.out.println("\n* Danh sach giao dich vang *");
        for (int i = 0; i < vangs.size(); i++) {
            System.out.println((i + 1) + ". " + vangs.get(i).toString());
        }

        System.out.println("\n* Danh sach giao dich tien te *");
        for (int i = 0; i < tienTes.size(); i++) {
            System.out.println((i + 1) + ". " + tienTes.get(i).toString());
        }
    }

    /**
     * tong so luong giao dich cua tung loai giao dich
     * @param vangs
     * @param tienTes
     */
    public static void soLuongGiaoDich(ArrayList<Vang> vangs, ArrayList<TienTe> tienTes) {
        int sumVang = 0;
        for (Vang vang : vangs) {
            sumVang += vang.getSoLuong();
        }

        int sumTienTe = 0;
        for (TienTe tienTe : tienTes) {
            sumTienTe += tienTe.getSoLuong();
        }

        System.out.println("Tong so luong giao dich vang: " + sumVang);
        System.out.println("Tong so luong giao dich tien te: " + sumTienTe);
    }

    /**
     * trung binh thanh tien cua giao dich tien te
     * @param tienTes
     */
    public static void trungBinhThanhTien(ArrayList<TienTe> tienTes) {
        double sum = 0;
        for (TienTe tienTe : tienTes) {
            sum += tienTe.thanhTien(tienTe);
        }

        System.out.println("Trung binh thanh tien cua giao dich tien te: " + sum / tienTes.size());
    }

    /**
     * xuat ra giao dich co don gia lon hon 1 ty
     * @param vangs
     * @param tienTes
     */
    public static void checkDonGia(ArrayList<Vang> vangs, ArrayList<TienTe> tienTes) {
        System.out.println("* Cac giao dich co don gia lon hon 1 ty *");

        int count = 1;
        for (Vang vang : vangs) {
            if (vang.getDonGia() > Math.pow(10, 9)) {
                System.out.println(count + ". " + vang.toString());
                count++;
            }
        }

        for (TienTe tienTe : tienTes) {
            if (tienTe.getDonGia() > Math.pow(10, 9)) {
                System.out.println(count + ". " + tienTe.toString());
                count++;
            }
        }
    }
}
