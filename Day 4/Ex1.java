import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner once for efficiency

        // Get input for both numbers
        System.out.print("Nhap so thu nhat: ");
        float soThuNhat = scanner.nextFloat();
        System.out.print("Nhap so thu hai: ");
        float soThu2 = scanner.nextFloat();

        // Calculate and print difference and quotient
        System.out.println("Hieu cua hai so la: " + (soThuNhat - soThu2));
        if (soThu2 != 0) {
            System.out.println("Thuong cua hai so la: " + (soThuNhat / soThu2));
        } else {
            System.out.println("Loi so. Vui long nhap lai");
        }

        // Calculate and print GCD if both numbers are integers
        if (Math.floor(soThuNhat) == soThuNhat && Math.floor(soThu2) == soThu2) {
            System.out.println("Uoc chung lon nhat cua hai so la: " + gcd(soThuNhat, soThu2));
        } else {
            System.out.println("Khong co uoc chung lon nhat");
        }
    }

    // Optimized GCD function using the Euclidean algorithm
    static int gcd(float a, float b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            float temp = b;
            b = a % b;
            a = temp;
        }
        return (int) a;
    }
}