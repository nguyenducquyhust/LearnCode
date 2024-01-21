import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so n phan tu cua mang : ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Gia tri cua n khong hop le. Vui long nhap lai n.");
            return;
        }
        System.out.println(" n phan tu bao gom : ");
        int[] a = new int[1000];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("So dau tien trong mang: " + a[1]);
        System.out.println("So gan cuoi trong mang: " + a[n - 1]);
    }
}

