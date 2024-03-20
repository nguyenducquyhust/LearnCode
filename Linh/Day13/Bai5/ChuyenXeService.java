package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeService {
    static Scanner scanner = new Scanner(System.in);

    /**
     * nhap thong tin chuyen xe noi thanh
     *
     * @param chuyenXeNoiThanhs
     */
    public static void nhapDanhSachNoiThanh(ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanhs) {
        System.out.println(" Nhap danh sach chuyen xe noi thanh: ");
        System.out.println(" Nhap so xe: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(" Nhap thong tin xe thu " + i + ": ");

            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhapThongTinChuyenXe();
            chuyenXeNoiThanhs.add(chuyenXeNoiThanh);
        }
    }

    /**
     * nhap thong tin chuyen xe ngoai thanh
     *
     * @param chuyenXeNgoaiThanhs
     */
    public static void nhapDanhSachNgoaiThanh(ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanhs) {
        System.out.println(" Nhap danh sach chuyen xe ngoai thanh: ");
        System.out.println(" Nhap so xe: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(" Nhap thong tin xe thu " + i + ": ");

            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhapThongTinChuyenXe();
            chuyenXeNgoaiThanhs.add(chuyenXeNgoaiThanh);
        }

    }

    /**
     * xuat thong tin chuyen xe noi thanh
     *
     * @param chuyenXeNoiThanhs
     */
    public static void xuatDanhSachNoiThanh(ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanhs) {
        System.out.println(" Danh sach xe noi thanh");

        for (int i = 0; i < chuyenXeNoiThanhs.size(); i++) {
            System.out.println(" Xe thu " + i + " : " + chuyenXeNoiThanhs.get(i).toString());
        }
    }

    /**
     * xuat thong tin chuyen xe ngoai thanh
     *
     * @param chuyenXeNgoaiThanhs
     */
    public static void xuatDanhSachNgoaiThanh(ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanhs) {
        System.out.println(" Danh sach xe noi thanh");

        for (int i = 0; i < chuyenXeNgoaiThanhs.size(); i++) {
            System.out.println(" Xe thu " + i + " : " + chuyenXeNgoaiThanhs.get(i).toString());
        }
    }

    /**
     * ham tinh doanh thu noi thanh
     * @param chuyenXeNoiThanhs
     */
    public static void tongDoanhThuNoiThanh(ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanhs) {
        double sum = 0;
        for (ChuyenXeNoiThanh chuyenXeNoiThanh : chuyenXeNoiThanhs) {
            sum += chuyenXeNoiThanh.getDoanhThu();
        }
        System.out.println(" Doanh thu cua chuyen xe noi thanh: " + sum);

    }

    /**
     * ham tinh doanh thu ngoai thanh
     * @param chuyenXeNgoaiThanhs
     */
    public static void tongDoanhThuNgoaiThanh(ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanhs) {
        double sum = 0;
        for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : chuyenXeNgoaiThanhs) {
            sum += chuyenXeNgoaiThanh.getDoanhThu();
        }
        System.out.println(" Doanh thu cua chuyen xe noi thanh: " + sum);

    }
}
