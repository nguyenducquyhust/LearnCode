package Day12.exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeService {
    static Scanner scanner = new Scanner(System.in);

    static  int n;
    public static ArrayList<ChuyenXeNoiThanh> nhapDSKH(int n) {
        ArrayList<ChuyenXeNoiThanh> danhSachChuyenXeNoiThanh = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Chuyen xe Noi Thanh : " + i);
            scanner.nextLine();

            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhapThongTin();
            danhSachChuyenXeNoiThanh.add(chuyenXeNoiThanh);
        }
        return danhSachChuyenXeNoiThanh;
    }
    static ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanh = nhapDSKH(n);


    public static ArrayList<ChuyenXeNgoaiThanh> nhapDSKH1(int n) {
        ArrayList<ChuyenXeNgoaiThanh> danhSachChuyenXeNgoaiThanh = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Chuyen xe ngoai thanh thu " + i);
            scanner.nextLine();

            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhapThongTin();
            danhSachChuyenXeNgoaiThanh.add(chuyenXeNgoaiThanh);
        }
        return danhSachChuyenXeNgoaiThanh;
    }
    static ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanh = nhapDSKH1(n);

    public static void hienThiDanhSachChuyenXeNoiThanh(ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanh) {
        System.out.println("Danh sách chuyến xe nội thành:");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", "Mã số chuyến", "Họ tên tài xế", "Số xe", "Doanh thu", "Số chuyến", "Số km đi được");
        for (ChuyenXeNoiThanh chuyen : chuyenXeNoiThanh) {
            System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", chuyen.getMaSoChuyen(), chuyen.getHoTenTaiXe(), chuyen.getSoXe(), chuyen.getDoanhThu(), chuyen.getSoChuyen(), chuyen.getSoKmDiDuoc());
        }
    }

    public static void hienThiDanhSachChuyenXeNgoaiThanh(ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanh) {
        System.out.println("Danh sách chuyến xe ngoại thành:");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", "Mã số chuyến", "Họ tên tài xế", "Số xe", "Nơi đến", "Số ngày đi được", "Doanh thu");
        for (ChuyenXeNgoaiThanh chuyen : chuyenXeNgoaiThanh) {
            System.out.printf("%-15s %-20s %-15s %-15s %-15d %-15.2f\n", chuyen.getMaSoChuyen(), chuyen.getHoTenTaiXe(), chuyen.getSoXe(), chuyen.getNoiDen(), chuyen.getSoNgayDiDuoc(), chuyen.getDoanhThu());
        }
    }

    public static void tongDoanhThuCHuyenXeNoiThanh(ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanh) {
        long sumNoiThanh = 0;
        for (ChuyenXeNoiThanh chuyenXeNoiThanh1 : chuyenXeNoiThanh) {
            sumNoiThanh += chuyenXeNoiThanh1.getDoanhThu();
        }

        System.out.println("Doanh thu chuyen xe noi Thanh la : " + sumNoiThanh);
    }



    public static void tongDoanhThuChuyenXeNgoaiThanh(ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanh) {
        long sumNgoaiThanh = 0;
        for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh1 : chuyenXeNgoaiThanh) {
            sumNgoaiThanh += chuyenXeNgoaiThanh1.getDoanhThu();
        }
        System.out.println("Doanh thu chuyen xe Ngoai Thanh la :" + sumNgoaiThanh);
    }


}
