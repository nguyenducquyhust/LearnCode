import java.util.Scanner;

public class Buoi1_ex2_1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Moi nhhap n: ");
        n = scanner.nextInt();
        if (n < 1) {
            System.out.println(" n<1 ");
        } else if (n > 1 & n < 3) {
            System.out.println("Java");
        } else if (n > 4 & n < 6) {
            System.out.println("Python");
        } else {
            System.out.println("Gia tri cua n khong hop le. Vui long nhap lai n.");
        }
    }
}

