package xeCo;
import nganHang.Account;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //menu
        System.out.println("---------------------------Menu------------------------");
        System.out.println("| chon 1 : Tạo các đối tượng xe và nhập thông tin     |");
        System.out.println("| chon 2 : Xuất bảng kê khai tiền thuế của các xe.    |");
        System.out.println("| chon 3 : thoat chuong trinh                         |");
        System.out.println("<<--------------------------------------------------->>");

        //choice
        int choice = 1;

        //danh sach xe
        ArrayList<Vehicle> danhSachXe = new ArrayList<>();

        while (choice >= 1 && choice <= 3) {
            System.out.println("Nhập số từ 1 - 3 để thực hiện thao tác trong menu:");
            choice = scanner.nextInt();
            switch (choice) {

                case 1: {
                    danhSachXe = hamNhapDanhSachXe();
                    break;
                }

                case 2: {
                    tinhTienThue(danhSachXe);
                    xuatKeKhai(danhSachXe);
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

    public static ArrayList<Vehicle> hamNhapDanhSachXe() {
        ArrayList<Vehicle> danhSachXe = new ArrayList<Vehicle>();
        System.out.println("nhập số lượng xe: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        for (int i = 1; i <= n; i++) {
            System.out.println("nhập xe thứ " + i);
            Vehicle vehicle = new Vehicle();
            vehicle.inputInfor();
            danhSachXe.add(vehicle);
        }
        return danhSachXe;
    }
    public static void tinhTienThue(ArrayList<Vehicle> danhSach){
        long tinhTienThue = 0;
        for (Vehicle vehicle : danhSach){
            if (vehicle.getDungTich() <100){
                tinhTienThue = (long) ( 0.01 * vehicle.getGiaXe());
                vehicle.setThueTrcBa(tinhTienThue);
            }else if (100 <= vehicle.getDungTich() && vehicle.getDungTich() <= 200){
                tinhTienThue = (long) (0.03 * vehicle.getGiaXe());
                vehicle.setThueTrcBa(tinhTienThue);
            }else {
                tinhTienThue = (long) ( 0.05 * vehicle.getGiaXe());
                vehicle.setThueTrcBa(tinhTienThue);
            }
        }


    }
    public static void xuatKeKhai(ArrayList<Vehicle> danhSachLinhTinh) {
        if (danhSachLinhTinh.isEmpty()) {
            System.out.println("\nDanh sách xe trống!");
            return;
        }
        for (Vehicle vehicle : danhSachLinhTinh) {
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(vehicle.getGiaXe());
            String str2 = currencyEN.format(vehicle.getThueTrcBa());

            System.out.printf("%-10s %-20d %-20s %-20s \n", vehicle.getTenXe(), vehicle.getDungTich(),str1, str2);
        }
    }

}
