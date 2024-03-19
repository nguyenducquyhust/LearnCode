package day11.exercise1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-------------------------------Menu----------------------------");
        System.out.println("| Chon 1: Tao cac doi tuong xe va nhap thong tin              |");
        System.out.println("| Chon 2: Xuat bang ke khai tien thue cua cac xe              |");
        System.out.println("| Chon 3: Thoat                                               |");
        System.out.println("<<----------------------------------------------------------->>");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        boolean check = false;
        while (true) {
            System.out.print("\nNhap lua chon: ");
            int option = scanner.nextInt();
            if (option == 1) {
                check = true;
                VehicleService.nhapDanhSach(vehicles);
            } else if (option == 2 && check) {
                VehicleService.xuatTienThue(vehicles);
            } else if (option == 3) {
                System.exit(0);
                break;
            } else {
                System.out.println("Lua chon khong hop le");
            }
        }
    }
}
