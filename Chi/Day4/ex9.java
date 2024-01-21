import java.util.Scanner;

public class Ex9 {
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
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        int min = 100000, vitri = 0;
        for (int j = 1; j <= n; j++) {
            if ((a[j] < min) && (a[j] > 0)) {
                min = a[j];
                vitri = j;
            }
        }
        System.out.println("Phan tu duong nho nhat trong mang la: " + min);
        System.out.println(" Vi tri so : " + vitri);
    }
}