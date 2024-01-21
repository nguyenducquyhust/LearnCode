import java.util.Scanner;
public class ex4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n;
        n = scanner.nextInt();
        int[] a = new int[1000];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Cac phan tu trong mang theo thu tu dao nguoc: ");
        for(int i = n; i > 0; i--){
            System.out.println( + a[i] );
        }
    }
}
