import java.util.Scanner;

public class ex4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n phan tu cua mang : ");
        int n, k = 0;
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
        System.out.println("Cac phan tu trung lap nhau trong mang: ");
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    k++;
                }
            }
        }
        System.out.println("So luong cac phan tu trung nhau trong mang la: " + k);
    }
}
