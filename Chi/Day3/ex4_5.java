import java.util.Scanner;

public class ex4_5 {
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
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += a[i];
        }
        int Trungbinhcong = sum / n;
        System.out.println("Trung binh cong cac phan tu trong mang la: " + Trungbinhcong);
    }
}

