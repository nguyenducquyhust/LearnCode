import java.util.Scanner;

public class Buoi1_ex2_2 {
    public static void main(String[] args) {
        int n, i;
        System.out.print("Nhap so n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Gia tri cua n khong hop le. Vui long nhap lai n.");
            return;
        }
        if (n % 2 == 0) {
            i = 1;
        } else {
            i = 2;
        }
        long sum = 0;
        for (; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Ket qua day so la = " + sum);
    }
}


