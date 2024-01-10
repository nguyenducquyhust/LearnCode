import java.util.Scanner;
public class ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n;
        n = scanner.nextInt();
        int[] a = new int[1000];
        for(int i = 1; i <= n ; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println("Cac gia tri cua mang: ");
        for(int j = 1; j <= n; j++){
            System.out.println( + a[j] );
        }
    }
}
