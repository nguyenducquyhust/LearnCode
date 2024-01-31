
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("Chuong trinh giai phuong trinh bac 2: ax" + (char) 178 + "+bx+c=0 (a≠0)");
        System.out.println("1.Nhap 3 he so a, b, c");
        System.out.println("2.Xac dinh nghiem");
        System.out.println("3.Thoat");
        System.out.println("Moi ban nhap so 1, 2, 3 de bat dau chuong trinh_\n");

        boolean valid = false;
        double a = 0;
        double b = 0;
        double c = 0;
        while (true) {
            System.out.println("Nhap lua chon cua ban: ");
            double option = nhapLieu();
            if (option == 3) {
                System.out.println("Ket thuc chuong trinh");
                System.exit(0);
                break;
            } else if (option == 1) {
                valid = true;
                Scanner sc = new Scanner(System.in);
                System.out.println(" Moi nhap vao so a: ");
                a = sc.nextDouble();
                System.out.println(" Moi nhap vao so b: ");
                b = sc.nextDouble();
                System.out.println(" Moi nhap vao so c: ");
                c = sc.nextDouble();
                System.out.println("Xong buoc 1. Nhap so tiep theo");
            } else if (option == 2) {
                if (valid) {
                    System.out.println(giaiPhuongTrinhBac2(a, b, c));
                    System.out.println("Xong buoc 1. Nhap so tiep theo");
                } else {
                    System.out.println("Khong xac dinh duoc nghiem do chua nhap he so. Vui long nhap la!");
                }
            } else {
                System.out.println("Khong thao man. Vui long nhap lai!");
            }
        }
    }


    static double nhapLieu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    static String giaiPhuongTrinhBac2(double a, double b, double c) {
        // Neu a=0 thi pt thanh pt bac 1: bx+c=0
        if (a == 0) {
            if (b == 0 && c == 0)
                return " Phuong trinh bac nhat vo so nghiem";
            else if (b == 0) {
                return "Phuong trinh bac nhat vo nghiem";
            } else
                return " Phuong trinh bac nhat co nghiem: " + (-c / b);
        } else {
            // Giai phuong trinh bac 2
            double delta = (b * b) - (4 * a * c);
            if (delta < 0)
                return "Phuong trinh bac 2 vo nghiem";
            else if (delta == 0) {
                double x = -b / (2 * a);
                return "Phuong trinh bac 2 co nghiem kep x: " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return " Phuong trinh bac 2 co 2 nghiem phan biet x1= " + x1 + " va x2= " + x2;
            }
        }
    }
}

