import java.util.Scanner;

public class Ex8 {
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
        int chan = 0;
        for (int j = n-1; j > 0; j--) {
            if (a[j] % 2 == 0) {
                chan = a[j];
                break;
            }
        }
        System.out.println("Gia tri so chan cuoi cung cua mang la: " + chan);
    }
}
