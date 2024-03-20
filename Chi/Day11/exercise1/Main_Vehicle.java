package exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Vehicle {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---------------------------Menu------------------------");
        System.out.println("| chon 1 : Tao cac doi tuong xe va nhap thong tin   |");
        System.out.println("| chon 2 : Xuat bang ke khai tien thue cua cac xe   |");
        System.out.println("| chon 3 : Thoat                                    |");
        System.out.println("<<--------------------------------------------------->>");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        boolean check = false;
        while (true){
            System.out.println(" Nhap lua chon: ");
            int luaChon = scanner.nextInt();

            if( luaChon == 1 ){
                check = true;
                VehicleService.nhapDanhSach(vehicles);
            } else if( luaChon == 2 && check ){
                VehicleService.tienThue(vehicles);
            } else if( luaChon == 3){
                System.exit(0);
            } else {
                System.out.println(" Nhap lai!");
            }
        }
    }


}