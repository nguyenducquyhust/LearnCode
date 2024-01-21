import java.util.Scanner;

public class ex4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n phan tu cua mang : ");
        int n;
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Gia tri cua n khong hop le. Vui long nhap lai n.");
            return;
        }
        System.out.println(" n phan tu bao gom : ");
        int[] a = new int[1000];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Cac phan tu trong mang theo thu tu dao nguoc: ");
        for (int i = n; i > 0; i--) {
            System.out.println(a[i]);
        }
    }
}

