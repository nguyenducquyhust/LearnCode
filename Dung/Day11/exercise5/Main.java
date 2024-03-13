package day11.exercise5;

import java.util.ArrayList;
import java.util.Scanner;

import static day11.exercise5.ChuyenXeService.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanhs = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanhs = new ArrayList<>();

        System.out.print("Nhap so chuyen xe noi thanh: ");
        int noiThanh = scanner.nextInt();
        System.out.print("Nhap so chuyen xe ngoai thanh: ");
        int ngoaiThanh = scanner.nextInt();

        dsNoiThanh(noiThanh, chuyenXeNoiThanhs);
        dsNgoaiThanh(ngoaiThanh, chuyenXeNgoaiThanhs);

        xuatDanhSach(chuyenXeNoiThanhs, chuyenXeNgoaiThanhs);
        tongDoanhThu(chuyenXeNoiThanhs, chuyenXeNgoaiThanhs);
    }
}
