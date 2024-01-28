package day5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.print("Nhap so thu nhat: ");                       //Nhap number1, number2
        float number1 = nhapLieu();
        System.out.print("Nhap so thu hai: ");
        float number2 = nhapLieu();

        System.out.println("Hieu cua hai so la: " + tinhHieu(number1, number2));         //Tinh hieu hai so

        System.out.println("Thuong cua hai so la: " + tinhChia(number1, number2));       //Tinh thuong hai so

        int checkNumber1 = checkIntegerNumber(number1);                                  //Tinh UCLN hai so
        int checkNumber2 = checkIntegerNumber(number2);
        if (checkNumber1 == 1 && checkNumber2 == 1) {
            System.out.println("Uoc chung lon nhat cua hai so la: " + timUocChungLonNhat(number1, number2));
        } else {
            System.out.println("Khong co uoc chung lon nhat");
        }
    }
    static float nhapLieu() {                             //Ham nhap lieu
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    static float tinhHieu(float a, float b) {             //Ham tinh hieu
        return a - b;
    }

    static float tinhChia(float a, float b) {             //Ham tinh thuong
        float thuong = 0;
        if (b != 0) {
            thuong = a / b;
        } else {
            System.out.println("Khong co phep chia " + a + " cho " + b);
        }
        return thuong;
    }

    static int checkIntegerNumber(float number) {         //Ham kiem tra xem cac number la real hay integer
        int check = 1;
        if (Math.ceil(number) != Math.floor(number)) {    //check = 0 => real
            check = 0;                                    //check = 1 => integer
        }
        return check;
    }

    static int timUocChungLonNhat(float number1, float number2) {              //Ham tim UCLN
        int gcd = 1;
        if (number1 == 0 || number2 == 0) {
            System.out.println("Khong co uoc chung lon nhat");
        } else {
            for (int i = 1; i <= Math.abs(number1) && i <= Math.abs(number2); i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }
}
