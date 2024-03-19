package day11.exercise1;

import java.util.Scanner;

public class Vehicle {

    static Scanner scanner = new Scanner(System.in);

    private long triGiaXe;
    private int dungTichXyLanh;

    public long getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(long triGiaXe) {
        this.triGiaXe = triGiaXe;
    }

    public int getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public void setDungTichXyLanh(int dungTichXyLanh) {
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public double mucThue(Vehicle vehicle) {
        if (vehicle.getDungTichXyLanh() < 100) {
            return (double) vehicle.getDungTichXyLanh() / 100;
        } else if (vehicle.getDungTichXyLanh() >= 100 && vehicle.getDungTichXyLanh() <= 200) {
            return (double) vehicle.getDungTichXyLanh() * 3 / 100;
        } else {
            return (double) vehicle.getDungTichXyLanh() * 5 / 100;
        }
    }

    public void nhapThongTin(Vehicle vehicle) {
        System.out.print("Nhap tri gia xe: ");
        long triGia = scanner.nextLong();
        vehicle.setTriGiaXe(triGia);

        System.out.print("Nhap dung tich xy lanh: ");
        int dungTich = scanner.nextInt();
        vehicle.setDungTichXyLanh(dungTich);
    }
}
