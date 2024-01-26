package buoi4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float number1;
        float number2;

        // nhập số
        number1 = nhapLieu();
        number2 = nhapLieu();

        // tính hiệu 2 số
        System.out.println(tinhHieu(number1, number2));

        // tính chia
        System.out.println(tinhChia(number1, number2));

        //tìm ướng chung lớn nhất
        System.out.println(uocChungLonNhat(number1, number2));
    }

    //hàm nhập dữ liệu float
    public static float nhapLieu() {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        return a;
    }

    // hàm tính hiệu
    public static float tinhHieu(float soBiTru, float soTru) {
        float hieu = soBiTru - soTru;
        return hieu;
    }

    // hàm tính chia
    public static float tinhChia(float soBiChia, float soChia) {
        float thuong = 0;
        if (soChia != 0) {
            thuong = soBiChia / soChia;
        } else {
            System.out.println("không thể chia cho số 0");
        }
        return thuong;
    }

    // hàm tìm ước chung lớn nhất
    public static float uocChungLonNhat(float soThuNhat, float soThuHai) {

        int uCLN = 1;
        if (soThuNhat == 0 || soThuHai == 0) {
            System.out.println("không xét ước chung cho số 0");
            return uCLN = 0;
        } else {
            if (Math.abs(soThuNhat) >= Math.abs(soThuHai)) {
                for (int i = 1; i <= Math.abs(soThuHai); i++) {
                    if (soThuNhat % i == 0 && soThuHai % i == 0) {
                        uCLN = i;
                    }
                }
                return uCLN;
            } else {
                for (int i = 1; i <= Math.abs(soThuNhat); i++) {
                    if (soThuNhat % i == 0 && soThuHai % i == 0) {
                        uCLN = i;
                    }
                }
                return uCLN;
            }
        }

    }
}
