
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            double sum = 0.0;

            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }

            System.out.printf("Tổng của dãy số là: %.3f\n", sum );
        } else {
            System.out.println("Lỗi: n phải là số nguyên dương.");
        }


    }
}