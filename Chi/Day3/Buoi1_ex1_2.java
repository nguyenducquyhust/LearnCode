import java.util.Scanner;

public class Buoi1_ex1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            double sum = 0.0;

            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }

            System.out.printf("Tong cua day so la : %.3f\n", sum);
        } else {
            System.out.println("Loi : n khong phai so nguyen duong. Vui long nhap lai n");
        }


    }
}
