package day5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        println("Đây là chương trình giải phương trình bậc 2: ax" + (char) 178 + "+bx+c=0 (a≠0)");
        println("1.Nhập 3 hệ số a, b, c");
        println("2.Xác định nghiệm");
        println("3.Thoát");
        println("_Mời bạn nhập số 1, 2, 3 để chương trình được bắt đầu_\n");

        boolean valid = false;
        double a = 0;
        double b = 0;
        double c = 0;
        while (true) {
            print("Lựa chọn của bạn: ");
            double option = nhapLieu();
            if (option == 3) {
                println("Kết thúc chương trình");
                System.exit(0);
                break;
            } else if (option == 1) {
                valid = true;
                do {
                    print("Nhập hệ số a khác 0: ");
                    a = nhapLieu();
                } while (a == 0);
                print("Nhập hệ số b: ");
                b = nhapLieu();
                print("Nhập hệ số c: ");
                c = nhapLieu();
                println("Xong bước 1, nhập số tiếp theo.");
            } else if (option == 2) {
                if (valid) {
                    xacDinhNghiem(a, b, c);
                    println("Xong bước 1, nhập số tiếp theo.");
                } else {
                    println("Không xác định được nghiệm do chưa nhập hệ số. Mời nhập lại");
                }
            } else {
                println("Không thỏa mãn. Mời nhập lại");
            }
        }
    }

    public static void print(String string) {
        System.out.print(string);
    }

    public static void println(String string) {
        System.out.println(string);
    }

    static double nhapLieu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    static void xacDinhNghiem(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            println("Phương trình có hai nghiệm phân biệt: ");
            println("x1 = " + x1);
            println("x2 = " + x2);
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            println("Phương trình có một nghiệm duy nhất: ");
            println("x = " + x);
        } else {
            println("Phương trình vô nghiệm");
        }
    }
}
