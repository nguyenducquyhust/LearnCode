package Day_6;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap n ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Gia tri cua n khong hop le. Vui long nhap lai n.");
            return;
        }
        System.out.printf(" n So nguyen to dau tien la: ", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (kiemTraSoNguyenTo(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }

    static boolean kiemTraSoNguyenTo(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // so nguyen to khi n >= 2
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
