package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
        while(true){

            System.out.println("Tạo các đối tượng xe và nhập thông tin\n" +
                    "Xuất bảng kê khai tiền thuế của các xe.\n" +
                    "Thoát\n");
            int a = sc.nextInt();

            if(a == 1){
                arr = inputData();
            } else if(a == 2){
                taxPay(arr);
            }
            else if(a == 3){
                break;
            }else{
                System.out.println("please insert valid number you fucking stupid");
            }
            }
        }
        public static ArrayList<Vehicle> inputData(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
            System.out.println("how many vehicle");
            int amount = sc.nextInt();
            for(int i = 0;i < amount;i++){
                System.out.println("nhap ten xe thu " + (int)(i+1));
                String name = sc.next();
                int size = sc.nextInt();
                int price = sc.nextInt();
                arr.add(new Vehicle(name,size,price));
            }
            return arr;

        }
        public static void taxPay(ArrayList<Vehicle> a){
            for(Vehicle v1: a){
                System.out.println(v1.getName() + "'s tax is " + v1.payTax());
            }

        }

    }

