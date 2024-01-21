import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap so n phan tu cua mang : ");
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Gia tri cua n khong hop le. Vui long nhap lai n.");
            return;
        }
        int[] a = new int[1000];
        System.out.println(" n phan tu bao gom : ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] % 5 == 0) {
                sum += a[j];
            }
        }
        System.out.println("Tong cac phan tu trong mang chia het cho 5 la: " + sum);
    }
}
