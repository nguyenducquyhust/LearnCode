package exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleService {
    static Scanner scanner = new Scanner(System.in);
    /**
     * ham nhap danh sach
     * @param vehicles
     */
    public static void nhapDanhSach(ArrayList<Vehicle> vehicles) {
        System.out.print("Nhap so luong xe: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("* Nhap thong tin xe thu " + i + ": \n");
            Vehicle vehicle = new Vehicle();
            vehicle.nhapThongTin();
            vehicles.add(vehicle);
        }
    }

    /**
     * ham xuat tien thue cua cac xe
     * @param vehicles
     */
    public static void tienThue(ArrayList<Vehicle> vehicles){
        for ( int i = 0 ; i <= vehicles.size(); i++){
            System.out.println(" Tien thue cua xe thu " + (i+1) + ": " + vehicles.get(i).tinhThue(vehicles.get(i)));
        }
    }
}
