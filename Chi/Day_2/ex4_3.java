import java.util.Scanner;
public class ex4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n, k = 0;
        n = scanner.nextInt();
        int[] a = new int[1000];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        int Max =  a[1];
        int Min = a[1];

        for (int i = 2; i <= n; i++) {
            if (Max < a[i]) {
                Max = a[i];
            }
        }
        System.out.println("Max: " + Max);
        for (int i = 2; i <= n; i++) {
            if (Min > a[i]) {
                Min = a[i];
            }
        }
        System.out.println("Min: " + Min);
    }
}
