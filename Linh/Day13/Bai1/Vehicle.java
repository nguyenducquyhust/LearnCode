package Bai1;

import java.util.Scanner;

public class Vehicle {
    static Scanner scanner = new Scanner(System.in);
    private double triGiaXe;
    private int dungTichXyLanh;

    public Vehicle() {
    }

    public Vehicle(double triGiaXe, int dungTichXyLanh) {
        this.triGiaXe = triGiaXe;
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public double getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(double triGiaXe) {
        this.triGiaXe = triGiaXe;
    }

    public int getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public void setDungTichXyLanh(int dungTichXyLanh) {
        this.dungTichXyLanh = dungTichXyLanh;
    }

    /**
     * hàm tính thuế của phương tiện...
     * @param vehicle
     * @return
     */
    public double tinhThue(Vehicle vehicle) {
        if (vehicle.dungTichXyLanh < 100) {
            return this.triGiaXe * 0.01;
        } else if (vehicle.dungTichXyLanh >= 100 && this.dungTichXyLanh <= 200) {
            return this.triGiaXe * 0.03;
        } else {
            return this.triGiaXe * 0.05;
        }
    }


    //Hàm nhập thông tin
    public void nhapThongTin(){
        System.out.println("Nhập giá trị xe: ");
        this.triGiaXe = scanner.nextDouble();

        System.out.println("Nhập dung tích xy lanh của xe: ");
        this.dungTichXyLanh = scanner.nextInt();

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "triGiaXe=" + triGiaXe +
                ", dungTichXyLanh=" + dungTichXyLanh +
                '}';
    }
}
