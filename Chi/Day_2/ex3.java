import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println(" Moi nhap n: ");
        n = scanner.nextInt();
        int[] a = new int[1000];
        for(int i = 1; i <= n ; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(" So dau la : " + a[1] );
        System.out.println(" so gan cuoi la : " + a[n-1] );
    }
}
