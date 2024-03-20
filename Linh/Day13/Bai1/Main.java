package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("....................Menu........................");
        System.out.println("| Chọn 1: tạo các đối tượng xe và nhập thông tin");
        System.out.println("| Chọn 2: Xuất bảng kê khai tiền thuế của các xe");
        System.out.println("| Chọn 3 : Thoát ");
        System.out.println("<<............................................>>");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        boolean check = false;
        while (true){
            System.out.println("Nhập lựa chọn: ");
            int luaChon = scanner.nextInt();

            if (luaChon == 1){
                check = true;
                nhapDanhSach(vehicles);
            }else if (luaChon == 2 && check){
                tinhthue(vehicles);
            }else {
                System.out.println("Nhập lại: ");
            }
        }

        /**
         * Hàm nhập danh sách
         */
    }

    public static void nhapDanhSach(ArrayList<Vehicle> vehicles) {
        System.out.println("Nhập số lượng xe: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(" Nhập thông tin xe thứ" + i + ":");
            Vehicle vehicle = new Vehicle();
            vehicle.nhapThongTin();
            vehicles.add(vehicle);
        }
    }

    public static void tinhthue(ArrayList<Vehicle> vehicles) {
        for (int i = 0; 1 < vehicles.size(); i++) {
            System.out.println("tiền thuế của xe thứ " + (i + 1) + ":" + vehicles.get(i).tinhThue(vehicles.get(i)));

        }
    }
}
