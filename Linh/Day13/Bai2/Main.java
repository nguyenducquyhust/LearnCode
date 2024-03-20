package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<SinhVien> sinhVien = new ArrayList<>();
        SinhVienUtil.nhapDanhSach(sinhVien);
        SinhVienUtil.sapXep(sinhVien);
    }
}
