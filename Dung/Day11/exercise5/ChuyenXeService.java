package day11.exercise5;

import java.util.ArrayList;

public class ChuyenXeService {
    /**
     * nhap danh sach xe noi thanh
     * @param n
     * @return
     */
    public static void dsNoiThanh(int n, ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanhs) {
        System.out.println("* Nhap thong tin cac chuyen xe noi thanh *");
        for (int i = 1; i <= n; i++) {
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            System.out.println("- Nhap thong tin xe thu " + i + ": ");
            chuyenXeNoiThanh.nhapThongTin();
            chuyenXeNoiThanhs.add(chuyenXeNoiThanh);
            System.out.println("\n");
        }
    }

    /**
     * nhap danh sach xe ngoai thanh
     * @param n
     * @return
     */
    public static void dsNgoaiThanh(int n, ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanhs) {
        System.out.println("* Nhap thong tin cac chuyen xe noi thanh *");
        for (int i = 1; i <= n; i++) {
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            System.out.println("- Nhap thong tin xe thu " + i + ": ");
            chuyenXeNgoaiThanh.nhapThongTin();
            chuyenXeNgoaiThanhs.add(chuyenXeNgoaiThanh);
            System.out.println("\n");
        }
    }

    /**
     * xuat thong tin cac xe
     * @param chuyenXeNoiThanhs
     * @param chuyenXeNgoaiThanhs
     */
    public static void xuatDanhSach(ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanhs, ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanhs) {
        System.out.println("* Danh sach chuyen xe noi thanh *");
        for (int i = 0; i < chuyenXeNoiThanhs.size(); i++) {
            System.out.println("- Thong tin chuyen xe thu " + (i + 1) + chuyenXeNoiThanhs.get(i).toString());
        }

        System.out.println("\n* Danh sach chuyen xe ngoai thanh *");
        for (int i = 0; i < chuyenXeNgoaiThanhs.size(); i++) {
            System.out.println("- Thong tin chuyen xe thu " + (i + 1) + chuyenXeNgoaiThanhs.get(i).toString());
        }

        System.out.println("\n");
    }

    /**
     * tong doanh thu cac xe
     * @param chuyenXeNoiThanhs
     * @param chuyenXeNgoaiThanhs
     */
    public static void tongDoanhThu(ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanhs, ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanhs) {
        long sumNoiThanh = 0;
        for (ChuyenXeNoiThanh chuyenXeNoiThanh : chuyenXeNoiThanhs) {
            sumNoiThanh += chuyenXeNoiThanh.getDoanhThu();
        }

        long sumNgoaiThanh = 0;
        for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : chuyenXeNgoaiThanhs) {
            sumNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
        }

        System.out.print("Doanh thu cua cac chuyen xe noi thanh: " + sumNoiThanh);
        System.out.print("Doanh thu cua cac chuyen xe ngoai thanh: " + sumNgoaiThanh);
    }
}
