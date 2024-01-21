import java.util.Scanner;
public class ex4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n;
        n = scanner.nextInt();
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
