package exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_SinhVien {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhvien = new ArrayList<>();

        SinhVienUtil.nhapDanhSach(sinhvien);
        SinhVienUtil.sapXep(sinhvien);
    }

    }