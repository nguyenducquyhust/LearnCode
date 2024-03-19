package day11.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleService {
    static Scanner scanner = new Scanner(System.in);

    public static void nhapDanhSach(ArrayList<Vehicle> vehicles) {
        System.out.print("Nhap so luong xe: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("* Nhap thong tin xe thu " + i + ": *\n");
            Vehicle vehicle = new Vehicle();
            vehicle.nhapThongTin(vehicle);
            vehicles.add(vehicle);
        }
    }

    /**
     * Xuat bang ke khai tien thue cua cac xe
     * @param vehicles
     */
    public static void xuatTienThue(ArrayList<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("Tien thue cua xe thu " + (i + 1) + ": " + vehicles.get(i).mucThue(vehicles.get(i)));
        }
    }
}
