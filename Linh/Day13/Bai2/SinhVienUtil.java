package Bai2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SinhVienUtil {
    static Scanner scanner = new Scanner(System.in);

    public static void nhapDanhSach(ArrayList<SinhVien> sinhViens){
        int soSinhVien;
        do {
            System.out.println("Nhap so sinh vien:" );
            soSinhVien = scanner.nextInt();
        } while (soSinhVien < 1);
        for (int i = 1; i<= soSinhVien; i++){
            SinhVien sinhVien = new SinhVien();
            System.out.println(" nhap thong tin sinh vien thu" + i + ":");
            sinhVien.nhapThongTin();
            sinhViens.add(sinhVien);
        }
    }
    public static void sapXep(ArrayList<SinhVien> sinhViens){
        for (int i = 0; i < sinhViens.size() - 1; i++){
            for (int j = i +1; j < sinhViens.size(); j++){
                if (sinhViens.get(i).getMaSinhVien()< sinhViens.get(j).getMaSinhVien()){
                    Collections.swap(sinhViens,i,j);
                }
            }
        }
        for ( int i = 0; i < sinhViens.size(); i++){
            System.out.println("thong tin sinh vien thu" + i + (i+1) + ":" + sinhViens.get(i).toString());

        }
    }

}
