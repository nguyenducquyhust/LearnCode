import java.util.Scanner;
public class ex4_6 {
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
        for(int j = 1; j <= n; j++){
            sum += a[j];
        }
        System.out.println("Tong cac phan tu trong mang la: " +sum);
    }
}
