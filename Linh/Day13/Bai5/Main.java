package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> chuyenXeNoiThanhs = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> chuyenXeNgoaiThanhs = new ArrayList<>();

        ChuyenXeService.nhapDanhSachNoiThanh(chuyenXeNoiThanhs);
        ChuyenXeService.nhapDanhSachNgoaiThanh(chuyenXeNgoaiThanhs);

        ChuyenXeService.xuatDanhSachNoiThanh(chuyenXeNoiThanhs);
        ChuyenXeService.xuatDanhSachNgoaiThanh(chuyenXeNgoaiThanhs);

        ChuyenXeService.tongDoanhThuNoiThanh(chuyenXeNoiThanhs);
        ChuyenXeService.xuatDanhSachNgoaiThanh(chuyenXeNgoaiThanhs);

    }

}
