package day11.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentUtil {
    static Scanner scanner = new Scanner(System.in);

    /**
     * nhap danh sach sinh vien
     * @param students
     */
    public static void nhapDanhSach(ArrayList<Student> students) {
        int soSinhVien;
        do {
            System.out.print("Nhap so sinh vien: ");
            soSinhVien = scanner.nextInt();
        } while (soSinhVien < 1);

        for (int i = 1; i <= soSinhVien; i++) {
            Student student = new Student();
            System.out.println("- Nhap thong tin sinh vien thu " + i + ": ");
            student.nhapThongTin(student);
            students.add(student);
        }
    }

    /**
     * xuat danh sach theo thu tu tang dan ma sinh vien
     * @param students
     */
    public static void sapXep(ArrayList<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getMaSinhVien() < students.get(j).getMaSinhVien()) {
                    Collections.swap(students, i ,j);
                }
            }
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println("- Thong tin sinh vien thu " + (i + 1) + ": " + students.get(i).toString());
        }
    }
}
