package exercise1;

import java.util.Scanner;

public class Vehicle {
    static Scanner scanner = new Scanner(System.in);

    private int dungTich;
    private double triGia;

    public Vehicle( int dungTich, double triGia) {
        this.dungTich = dungTich;
        this.triGia = triGia;
    }
    public Vehicle(){

    }


    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    /**
     * ham tinh thue xe
     * @param vehicle
     * @return
     */

    public double tinhThue(Vehicle vehicle){
        if(vehicle.getDungTich()<100) {
            return vehicle.getTriGia() * 0.01;

        }else if (vehicle.getDungTich() >= 100 && vehicle.getDungTich() <= 200){
            return vehicle.getTriGia() * 0.03;
        }else {
            return vehicle.getTriGia() * 0.05;
        }
    }


    /**
     * ham nhap thong tin
     */
//    public void nhapThongTin(Vehicle vehicle) {
//        System.out.print("Nhap tri gia xe: ");
//        double triGia = scanner.nextLong();
//        vehicle.setTriGia(triGia);
//
//        System.out.print("Nhap dung tich: ");
//        int dungTich = scanner.nextInt();
//        vehicle.setDungTich(dungTich);
//    }

   public void nhapThongTin(){
       System.out.println(" Nhap tri gia xe: ");
       this.triGia = scanner.nextDouble();

       System.out.println(" Nhap dung tich: ");
       this.dungTich = scanner.nextInt();
   }

    @Override
    public String toString() {
        return "exercise1.Vehicle{" +
                ", dungTich=" + dungTich +
                ", triGia=" + triGia +
                '}';
    }
}




