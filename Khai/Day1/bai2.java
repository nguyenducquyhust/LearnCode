import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào so nguyên n bất kỳ: ");
        n = scanner.nextInt();

        if (n < 1) {
            System.out.println("n<1");
        } else if (1 < n && n < 3) {
            System.out.println("java");
        } else if (4 < n && n < 6) {
            System.out.println("Python");
        } else {
            System.out.println("n>10");
        }
    }
}












