package sinhVien;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //menu
        System.out.println("---------------------------Menu--------------------------------");
        System.out.println("| chon 1 : Tạo các đối tượng sinh viên và nhập thông tin.     |");
        System.out.println("| chon 2 : Xuất danh sách sinh viên.                          |");
        System.out.println("| chon 3 : thoát chương trình.                                |");
        System.out.println("<<----------------------------------------------------------->>");

        //choice
        int choice = 1;

        //danh sach SV
        ArrayList<SinhVien> danhSachSv = new ArrayList<>();


        while (choice >= 1 && choice <= 3) {
            System.out.println("Nhập số từ 1 - 3 để thực hiện thao tác trong menu:");
            choice = scanner.nextInt();
            switch (choice) {

                case 1: {
                    danhSachSv = hamNhapDanhSachSv();
                    break;
                }

                case 2: {
                    if (danhSachSv.isEmpty()) {
                        System.out.println("\nDanh sách sinh viên trống!");
                    }

                    // Xuất danh sách sinh viên
                    danhSachSv.stream().sorted((sinhVien1, sinhVien2) -> Math.toIntExact(sinhVien1.getMaSinhVien() - sinhVien2.getMaSinhVien())).forEach(System.out::println);
                    break;
                }

                case 3: {
                    System.out.println("Đã thoát chương trình!");
                    System.exit(0);
                    break;
                }
            }
        }
    }

    public static ArrayList<SinhVien> hamNhapDanhSachSv() {
        ArrayList<SinhVien> danhSachSv = new ArrayList<SinhVien>();
        System.out.println("nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        for (int i = 1; i <= n; i++) {
            System.out.println("nhập sinh viên thứ " + i);
            SinhVien sinhVien = new SinhVien();
            sinhVien.inputSv();
            while (kiemTraSinhVienTrung(danhSachSv, sinhVien)) {
                System.out.println("Sinh viên đã tồn tại. Vui lòng nhập lại.");
                sinhVien = new SinhVien();
                sinhVien.inputSv();
            }
            danhSachSv.add(sinhVien);
        }
        return danhSachSv;
    }

    public static boolean kiemTraSinhVienTrung(ArrayList<SinhVien> danhSachSv, SinhVien sinhVien) {
        for (SinhVien existingAccount : danhSachSv) {
            if (existingAccount.getHoTen().equals(sinhVien.getHoTen()) || existingAccount.getMaSinhVien() == (sinhVien.getMaSinhVien())) {
                return true;
            }
        }
        return false;
    }
}
