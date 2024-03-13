package xeCo;

import java.util.Scanner;

public class Vehicle {
    private String tenXe;
    private int dungTich;
    private long giaXe;
    private long thueTrcBa;
    public Vehicle(){}

    public Vehicle(String tenXe, int dungTich, long giaXe, int thueTrcBa) {
        this.tenXe = tenXe;
        this.dungTich = dungTich;
        this.giaXe = giaXe;
        this.thueTrcBa = thueTrcBa;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public long getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(long giaXe) {
        this.giaXe = giaXe;
    }

    public long getThueTrcBa() {
        return thueTrcBa;
    }

    public void setThueTrcBa(long thueTrcBa) {
        this.thueTrcBa = thueTrcBa;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tenXe='" + tenXe + '\'' +
                ", dungTich=" + dungTich +
                ", giaXe=" + giaXe +
                ", thueTrcBa=" + thueTrcBa +
                '}';
    }
    public void inputInfor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên xe: ");
        String tenXe = scanner.nextLine();
        setTenXe(tenXe);

        System.out.println("Nhập giá tiền:");
        long giaTien = scanner.nextLong();
        setGiaXe(giaTien);

        System.out.println("Nhập dung tích xe: ");
        int dungTich = scanner.nextInt();
        setDungTich(dungTich);
    }
}

