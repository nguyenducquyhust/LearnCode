package buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int option;
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------chào mừng các bạn đến với bài tập về nhà của mình------ ");
            System.out.println("------bài tập giải phương trình bậc 2------");
            System.out.println("------nhập sự lựa chọn chọn của bạn------");
            System.out.println("1. nhập hệ số a, b, c");
            System.out.println("2. xác định nghiệm");
            System.out.println("3. thoát");

            do {
                System.out.println("nhập lựa chọn của bạn");
                option = scanner.nextInt();
            } while (option < 1 && option > 4);

            switch (option) {
                case 1:
                    System.out.println(" Xin mời nhập a:");
                    a= nhapLieu();
                    System.out.println(" Xin mời nhập b:");
                    b=nhapLieu();
                    System.out.println(" Xin mời nhập c:");
                    c=nhapLieu();
                    break;
                case 2:
                    if (a==0&&b==0&&c==0){
                        System.out.println("mời bạn nhập a,b,c đúng trước khi xác định nghiệm");
                        break;
                    } else {
                        xacDinhNghiem(a,b,c);
                    }
                    break;
                case 3:
                    if (a==0&&b==0&&c==0){
                        System.out.println("mời bạn nhập a,b,c đúng trước khi xác định nghiệm");
                        break;
                    } else {
                        System.exit(0);
                    }
                    break;
                default:
                    break;
            }
        } while (true);
    }

    // nhap so lieu
    public static int nhapLieu (){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    public static void xacDinhNghiem (int a,int b, int c){
        double denta = b * b - 4 * a * c;
        double x1;
        double x2;

        if (denta < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (denta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trình có 1 nghiệm: " + x1);
        } else {
            x1 = (-b - Math.sqrt(denta))/(2*a);
            x2 = (-b + Math.sqrt(denta))/(2*a);
            System.out.println("phương trình có 2 nghiệm là : " +x1+ ","+ x2);
        }
    }
}