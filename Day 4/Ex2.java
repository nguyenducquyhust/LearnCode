import java.util.Scanner;

public class Ex2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        scanner.close();
    }

    static void showMenu() {
        System.out.println("Chuong trinh giai phuong trinh bac 2: ax²+bx+c=0 (a≠0)");
        System.out.println("1. Nhap 3 he so a, b, c");
        System.out.println("2. Xac dinh nghiem");
        System.out.println("3. Thoat");
        System.out.println("Moi ban nhap so 1, 2, 3 de bat dau chuong trinh\n");

        while (true) {
            System.out.println("Nhap lua chon cua ban: ");
            int option = (int) nhapLieu();
            switch (option) {
                case 1:
                    nhapHeSo();
                    break;
                case 2:
                    System.out.println("Khong xac dinh duoc nghiem do chua nhap he so. Vui long nhap la!");
                    break;
                case 3:
                    System.out.println("Ket thuc chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }

    static double nhapLieu() {
        return scanner.nextDouble();
    }

    static void nhapHeSo() {
        System.out.println(" Moi nhap vao so a: ");
        double a = nhapLieu();
        System.out.println(" Moi nhap vao so b: ");
        double b = nhapLieu();
        System.out.println(" Moi nhap vao so c: ");
        double c = nhapLieu();
        System.out.println(giaiPhuongTrinhBac2(a, b, c));
    }

    static String giaiPhuongTrinhBac1(double b, double c) {
        if (b == 0 && c == 0)
            return " Phuong trinh bac nhat vo so nghiem";
        else if (b == 0)
            return "Phuong trinh bac nhat vo nghiem";
        else
            return " Phuong trinh bac nhat co nghiem: " + (-c / b);
    }

    static String giaiPhuongTrinhBac2(double a, double b, double c) {
        // Neu a=0 thi pt thanh pt bac 1: bx+c=0
        if (a == 0) {
            return giaiPhuongTrinhBac1(b, c);
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